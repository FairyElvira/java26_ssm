package com.zhiyou100.service;

import com.zhiyou100.entity.MyDirectory;
import com.zhiyou100.entity.MyFile;
import org.springframework.web.multipart.MultipartFile;

public interface MyFileService {

//    void addOne(MyDirectory myDirectory, MultipartFile fileInput);
    void addOne(MyDirectory myDirectory, MultipartFile fileInput);

    MyFile getOneByDid(Integer did);
}
