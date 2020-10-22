package com.zhiyou.dao;

import com.zhiyou.entity.ApplicationRecord;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplicationRecordMapper {

    @Select("select vid,visitor,visitorid,phone,interviewee,relationship,number,Appointment,photo,processingtime,denialreason from tab_school")
    List<ApplicationRecord> getAllMethod();

    @Select("select vid,visitor,visitorid,phone,interviewee,relationship,number,Appointment,photo,processingtime,denialreason from tab_school where vid=#{vid}")
    ApplicationRecord getOneByVidMethod(int vid);

    @Insert("insert into tab_school(visitor,visitorid,phone,interviewee,relationship,number,Appointment,photo,processingtime,denialreason) values (#{visitor},#{visitorid},#{phone},#{interviewee},#{relationship},#{number},#{Appointment},#{photo},#{processingtime},#{denialreason})")
    Integer addOneMethod(ApplicationRecord hang);

    @Delete("delete from tab_school where vid=#{vid}")
    Integer deleteOneByVidMethod(Integer vid);

    @Update("update tab_school set visitor=#{visitor},visitorid=#{visitorid},phone=#{phone},interviewee=#{interviewee},relationship=#{relationship},number=#{number},Appointment=#{Appointment},photo=#{photo},processingtime=#{processingtime},denialreason=#{denialreason} where vid=#{vid}")
    Integer updateOneByVidMethod(ApplicationRecord vid);
}
