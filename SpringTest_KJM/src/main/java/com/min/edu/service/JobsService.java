package com.min.edu.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.min.edu.model.IJobsDao;
import com.min.edu.vo.JobsVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Service
@RequiredArgsConstructor
public class JobsService implements IJobsService {
	
	private final IJobsDao dao;
	
	@Override
	public List<JobsVo> selectAll() {
		return dao.selectAll();
	}

}
