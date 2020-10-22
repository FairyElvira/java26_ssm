package com.zhiyou100.dao;

import com.zhiyou100.entity.MyDirectory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDirectoryMapper {

    //根据dfu获取集合
    @Select("select * from tab_directory where dfu=#{param1} and uid=#{param2}")
    List<MyDirectory> getListByDfu(String dfu,Integer uid);

    //判断文件夹是否已经存在
    MyDirectory  getOneByUidAndDfu(MyDirectory myDirectory);

    //删除
    @Delete("delete from tab_directory where did=#{param1} or dfu=#{param2} or dfu like #{param3}")
    void deleteMyDirectory(Integer did,String dfu,String dfuLike);

    int deleteByPrimaryKey(Integer did);

    int insert(MyDirectory record);

    int insertSelective(MyDirectory record);

    MyDirectory selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(MyDirectory record);

    int updateByPrimaryKey(MyDirectory record);
}