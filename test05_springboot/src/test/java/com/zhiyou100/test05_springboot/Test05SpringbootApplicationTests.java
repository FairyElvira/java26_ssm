package com.zhiyou100.test05_springboot;

import com.zhiyou100.entity.Student;
import com.zhiyou100.dao.WorkerDao;
import com.zhiyou100.entity.Worker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test05SpringbootApplicationTests {

	@Autowired
	private Student student;

	@Autowired
	private WorkerDao workerDao;
	@Test
	void contextLoads() {
		//System.out.println(student);
		System.out.println(workerDao.getOneByWid(1));
		System.out.println(workerDao.getOneByWid2(1));
		System.out.println(workerDao.getAll());
		System.out.println(workerDao.insertOne(new Worker(null,"新来的",12.3f)));
		System.out.println(workerDao.updateOne(new Worker(1,"新来的11",11.1f)));
//		System.out.println(workerDao.deleteOne(1));
	}

}
