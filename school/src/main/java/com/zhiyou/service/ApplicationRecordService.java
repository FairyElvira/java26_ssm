package com.zhiyou.service;

import com.zhiyou.entity.ApplicationRecord;

import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-21 14:35
 */
public interface ApplicationRecordService {

    List<ApplicationRecord> getAllMethod();

    ApplicationRecord getOneByVidMethod(Integer vid);

    Integer addOneMethod(ApplicationRecord applicationRecord);

    Integer deleteOneByVidMethod(Integer vid);

    Integer updateOneByVidMethod(ApplicationRecord vid);
}
