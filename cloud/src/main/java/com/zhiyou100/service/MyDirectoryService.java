package com.zhiyou100.service;

import com.zhiyou100.entity.MyDirectory;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MyDirectoryService {

    List<MyDirectory> getListByDid(Integer did,Integer uid);

    void addMyDirectory(MyDirectory myDirectory);

    void deleteMyDirectory(Integer did);

}
