package com.test.edu;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionManager;

import com.min.edu.aop.DaoLogAop;
import com.min.edu.model.IJobsDao;
import com.min.edu.service.IJobsService;
import com.min.edu.vo.JobsVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/*.xml"})
public class Test_JUnitTest {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	private IJobsService service;
	
	@Autowired
	private DataSourceTransactionManager manager;
	
	
	
	
	
	@Autowired
	private IJobsDao dao;

	@Test
	public void test() {
//		assertNotNull(sqlSessionTemplate);
		assertNotNull(manager);
	}
	
	

}
