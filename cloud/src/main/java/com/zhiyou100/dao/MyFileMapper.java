package com.zhiyou100.dao;

import com.zhiyou100.entity.MyFile;
import org.apache.ibatis.annotations.Select;

public interface MyFileMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(MyFile record);

    int insertSelective(MyFile record);

    MyFile selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(MyFile record);

    int updateByPrimaryKey(MyFile record);

    //判断md5是否存在
    @Select("select * from tab_file where fmd5=#{fmd5}")
    MyFile  getOneByFmd5(String fmd5);
}