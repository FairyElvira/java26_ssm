package com.zhiyou100.service;

import com.zhiyou100.dao.MyDirectoryMapper;
import com.zhiyou100.dao.MyFileMapper;
import com.zhiyou100.entity.MyDirectory;
import com.zhiyou100.entity.MyFile;
import com.zhiyou100.exception.DirectoryException;
import com.zhiyou100.exception.FileException;
import com.zhiyou100.util.FdfsUtil;
import com.zhiyou100.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-11 23:14
 */
@Service
public class MyFileServiceImpl implements MyFileService{
    public static String path="d:/imgs";//widows测试时 使用的文件存储目录
    //public static String path="/root/cloud/imgs";//nginx集群测试时 使用的文件存储目录
    //保存文件的目录如果不存在 就创建
//    {
//        File pathFile=new File(path);
//        if(!pathFile.exists()){
//            pathFile.mkdirs();
//        }
//    }
    @Autowired
    private MyFileMapper myFileMapper;
    @Autowired
    private MyDirectoryMapper myDirectoryMapper;
//    @Override
//    public void addOne(MyDirectory myDirectory, MultipartFile fileInput) {
//        //1 先判断当前目录下是否有同名的文件/文件夹
//        MyDirectory dbMyDirectory=myDirectoryMapper.getOneByUidAndDfu(myDirectory);
//        if(dbMyDirectory!=null){
//            throw new DirectoryException("文件夹已经存在！");
//        }
//        //2 判断文件是否存在
//        MyFile myFile;
//        try {
//            byte[] arr=fileInput.getBytes();//获取文件对应的字节数组
//            String fmd5= MD5.getInstance().getMD5(new String(arr,"UTF-8"));//获取md5值
//            myFile=myFileMapper.getOneByFmd5(fmd5);//判断md5值是否存在
//            if(myFile==null){//文件不存在需要上传
//                //文件上传
//                String furl=System.currentTimeMillis()+fileInput.getOriginalFilename();
//                File muDiFile=new File(path,furl);
//                fileInput.transferTo(muDiFile);
//                //保存myfile对象
//                myFile=new MyFile();
//                myFile.setFmd5(fmd5); myFile.setFurl(furl); myFile.setFsize(arr.length);
//                myFileMapper.insertSelective(myFile);
//                myFile=myFileMapper.getOneByFmd5(fmd5);//根据fmd5获取fid
//            }
//        }catch (Exception e){
//            throw new FileException(e.getMessage());
//        }
//
//        //3 添加mydirectory
//        myDirectory.setFid(myFile.getFid());
//        myDirectory.setDcreateTime(new Date());//设置创建时间
//        myDirectory.setDtype(1);//指定是文件
//        myDirectoryMapper.insert(myDirectory);//添加文件夹
//    }

    @Override
    public void addOne(MyDirectory myDirectory, MultipartFile fileInput) {
        //1 先判断当前目录下是否有同名的文件/文件夹
        MyDirectory dbMyDirectory=myDirectoryMapper.getOneByUidAndDfu(myDirectory);
        if(dbMyDirectory!=null){
            throw new DirectoryException("文件夹已经存在！");
        }
        //2 判断文件是否存在
        MyFile myFile;
        try {
            byte[] arr=fileInput.getBytes();//获取文件对应的字节数组
            String fmd5= MD5.getInstance().getMD5(new String(arr,"UTF-8"));//获取md5值
            myFile=myFileMapper.getOneByFmd5(fmd5);//判断md5值是否存在
            if(myFile==null){//文件不存在需要上传
                //文件上传
                //String furl=System.currentTimeMillis()+fileInput.getOriginalFilename();
                //File muDiFile=new File(path,furl);
                //fileInput.transferTo(muDiFile);

                //fdfs文件上传
                String fileName=fileInput.getOriginalFilename();
                String[] group_fileName= FdfsUtil.upload(fileInput.getBytes(),fileName);
                String furl=group_fileName[0]+"/"+group_fileName[1];

                //保存myfile对象
                myFile=new MyFile();
                myFile.setFmd5(fmd5); myFile.setFurl(furl); myFile.setFsize(arr.length);
                myFileMapper.insertSelective(myFile);
                myFile=myFileMapper.getOneByFmd5(fmd5);//根据fmd5获取fid
            }
        }catch (Exception e){
            throw new FileException(e.getMessage());
        }
        //3 添加mydirectory
        myDirectory.setFid(myFile.getFid());
        myDirectory.setDcreateTime(new Date());//设置创建时间
        myDirectory.setDtype(1);//指定是文件
        myDirectoryMapper.insert(myDirectory);//添加文件夹
    }

    @Override
    public MyFile getOneByDid(Integer did) {
        //获取mydirectory
        MyDirectory myDirectory=myDirectoryMapper.selectByPrimaryKey(did);
        //通过mydirectory的fid获取一个myfile
        return myFileMapper.selectByPrimaryKey(myDirectory.getFid());
    }
}
