package com.zhiyou100.action;

import com.zhiyou100.entity.MyDirectory;
import com.zhiyou100.entity.MyFile;
import com.zhiyou100.entity.ResponseEntity;
import com.zhiyou100.exception.FileException;
import com.zhiyou100.service.MyFileService;
import com.zhiyou100.util.FdfsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-11 23:19
 */

@RequestMapping("/myFile")
@Controller
public class MyFileController {

    //public static String path="d:/imgs";
    public static String path="/root/cloud/imgs";

    @Autowired
    private MyFileService myFileService;

    //文件上传
    @PostMapping("/upload.action")
    @ResponseBody
    public ResponseEntity<String> uploadMethod(MyDirectory myDirectory, MultipartFile fileInput){
        myFileService.addOne(myDirectory,fileInput);
        return new ResponseEntity<>(200,"文件上传完毕！",null);
    }

    //文件下载
//    @GetMapping("/download/{did}.action")
//    public org.springframework.http.ResponseEntity<byte[]>  downloadMethod(@PathVariable("did") Integer did,HttpServletRequest req){
//        try {
//            //获取文件对象
//            MyFile myFile=myFileService.getOneByDid(did);
//            //获取HttpHeaders对象来设置响应头
//            HttpHeaders headers=new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//            headers.setContentDispositionFormData("attachment",myFile.getFurl());
//            //获取源文件对应的字节输入流
//            File file=new File(path,myFile.getFurl());
//            FileInputStream fin=new FileInputStream(file);
//            byte[] arr=new byte[(int)file.length()];
//            fin.read(arr);
//            fin.close();
//            return new org.springframework.http.ResponseEntity<byte[]>(arr, headers, HttpStatus.CREATED);
//        }catch (Exception e){
//            throw new FileException(e.getMessage());
//        }
//    }

    @GetMapping("/download/{did}.action")
    public org.springframework.http.ResponseEntity<byte[]>  downloadMethod(@PathVariable("did") Integer did,HttpServletRequest req){
        try {
            //获取文件对象
            MyFile myFile=myFileService.getOneByDid(did);
            String furl=myFile.getFurl();
            //furl=group1/M00/00/00/wKgCgF-JIxOAc-OvAAE55w39gV480..png
            //获取HttpHeaders对象来设置响应头
            HttpHeaders headers=new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment",furl);
            //fdfs实现文件下载
            String group=furl.substring(0,furl.indexOf("/"));
            String fileName=furl.substring(furl.indexOf("/")+1);
            //download("group1","M00/00/00/wKgCgF-JA5uAGSfAAAA9JxdpQHI55..jpg","d:/test");
            //通过验证传递给FdfsUtil.download的文件名字 前面不能有/
            byte[] arr= FdfsUtil.download(group,fileName);
            System.out.println("group="+group+",fileName="+fileName);
            System.out.println("arr.length="+arr.length);

            return new org.springframework.http.ResponseEntity<byte[]>(arr, headers, HttpStatus.CREATED);
        }catch (Exception e){
            throw new FileException(e.getMessage());
        }
    }
}
