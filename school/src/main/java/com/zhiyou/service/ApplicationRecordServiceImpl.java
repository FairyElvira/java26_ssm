package com.zhiyou.service;

import com.zhiyou.dao.ApplicationRecordMapper;
import com.zhiyou.entity.ApplicationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-21 14:47
 */
@Service
public class ApplicationRecordServiceImpl implements ApplicationRecordService{

    @Autowired
    private ApplicationRecordMapper applicationRecordMapper;

    @Override
    public List<ApplicationRecord> getAllMethod() {
        return applicationRecordMapper.getAllMethod();
    }

    @Override
    public ApplicationRecord getOneByVidMethod(Integer vid) {
        return applicationRecordMapper.getOneByVidMethod(vid);
    }

    @Override
    public Integer addOneMethod(ApplicationRecord applicationRecord) {
        return applicationRecordMapper.addOneMethod(applicationRecord);
    }

    @Override
    public Integer deleteOneByVidMethod(Integer vid) {
        return applicationRecordMapper.deleteOneByVidMethod(vid);
    }

    @Override
    public Integer updateOneByVidMethod(ApplicationRecord vid) {
        return applicationRecordMapper.updateOneByVidMethod(vid);
    }
}
