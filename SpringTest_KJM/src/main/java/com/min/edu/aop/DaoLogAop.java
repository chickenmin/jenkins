package com.min.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class DaoLogAop {
	
	public void throwing(JoinPoint j, Exception error) {
		Logger log = LoggerFactory.getLogger(j.getTarget() + "");
		log.info(j.getTarget()+"");
		 log.info("에러 \t{}",j.getArgs());
		 log.info("에러 \t{}",error.toString());
	}
	
	public void returning(JoinPoint j, Object result) throws Throwable {
		Logger log = LoggerFactory.getLogger(j.getTarget() + "");
		log.info(j.getTarget()+"");
		ProceedingJoinPoint jp = (ProceedingJoinPoint)j;
		log.info("반환 종류 : {}",jp.proceed());
	}
	
	

}
