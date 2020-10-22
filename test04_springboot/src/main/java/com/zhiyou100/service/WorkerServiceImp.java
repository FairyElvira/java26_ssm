package com.zhiyou100.service;

import com.zhiyou100.dao.WorkerDao;
import com.zhiyou100.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 19:39
 */

@Service
public class WorkerServiceImp implements WorkerService {

    @Autowired
    private WorkerDao workerDao;
    @Override
    public List<Worker> getAllMethod() {
        return workerDao.getAllMethod();
    }

    @Override
    public Worker getOneMethod(Integer wid) {
        return workerDao.getOneMethod(wid);
    }

    @Override
    public int deleteOneMethod(Integer wid) {
        return workerDao.deleteOneMethod(wid);
    }

    @Override
    public int addOneMethod(Worker w) {
        return workerDao.addOneMethod(w);
    }

    @Override
    public int updateOneMethod(Worker w) {
        return workerDao.updateOneMethod(w);
    }
}
