package com.min.edu.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.stereotype.Repository;

import com.min.edu.vo.JobsVo;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class JobsDaoImpl implements IJobsDao {

	private final SqlSessionTemplate template;
	
	@Override
	public List<JobsVo> selectAll() {
		return template.selectList("com.min.edu.model.JobsDaoImpl.selectAll");
	}

}
