package com.tk.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.dao.SysLogMapper;
import com.tk.model.SysLogModel;
import com.tk.model.SysLogParamModel;
import com.tk.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService{

	@Autowired
	SysLogMapper sysLogMapper;
	private static final Logger logger = LoggerFactory.getLogger(SysLogServiceImpl.class);
	
	//获取所有条件符合的日志
	public List<SysLogModel> getLogInfo(SysLogParamModel sysLogParamModel){
		logger.info("SysLogServiceImpl getLogInfo success and time is " + System.currentTimeMillis());
		return sysLogMapper.getLogInfo(sysLogParamModel);
	}

}
