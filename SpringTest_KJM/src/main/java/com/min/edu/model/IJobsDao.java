package com.min.edu.model;

import java.util.List;

import com.min.edu.vo.JobsVo;

public interface IJobsDao {
	
	public List<JobsVo> selectAll();
}
