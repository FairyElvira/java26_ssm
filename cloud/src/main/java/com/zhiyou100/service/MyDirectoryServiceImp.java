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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-10 22:07
 */

@Service
@Transactional
public class MyDirectoryServiceImp  implements  MyDirectoryService{
    @Autowired
    private MyDirectoryMapper myDirectoryMapper;

    @Autowired
    private MyFileMapper myFileMapper;
    @Override
    public List<MyDirectory> getListByDid(Integer did,Integer uid) {
        if(did==0){
            return myDirectoryMapper.getListByDfu("0",uid);
        }
        //根据did获取其dfu
        MyDirectory myDirectory=myDirectoryMapper.selectByPrimaryKey(did);
        //拼凑dfu
        String dfu=myDirectory.getDfu()+"-"+myDirectory.getDid();
        System.out.println("dfu="+dfu);
        return myDirectoryMapper.getListByDfu(dfu,uid);
    }

    @Override
    public void addMyDirectory(MyDirectory myDirectory) {
        //判断当前文件夹下是否已经存在同名的子文件夹
        MyDirectory dbMyDirectory=myDirectoryMapper.getOneByUidAndDfu(myDirectory);
        if(dbMyDirectory!=null){
            throw new DirectoryException("文件夹已经存在！");
        }
        myDirectory.setDcreateTime(new Date());//设置创建时间
        if(myDirectory.getDtype()==null){
            myDirectory.setDtype(0);
        }
        myDirectoryMapper.insert(myDirectory);//添加文件夹
    }

    @Override
    public void deleteMyDirectory(Integer did) {
        String dfu=myDirectoryMapper.selectByPrimaryKey(did).getDfu();
        dfu+="-"+did;
        myDirectoryMapper.deleteMyDirectory(did,dfu,dfu+"-%");
    }

}
