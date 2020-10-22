package com.zhiyou100.service;

import com.zhiyou100.entity.Worker;

import java.util.List;

public interface WorkerService {

    public List<Worker> getAllMethod();

    public Worker getOneMethod(Integer wid);

    public int deleteOneMethod(Integer wid);

    public int addOneMethod(Worker w);

    public int updateOneMethod(Worker w);
}
