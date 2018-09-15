package com.tk.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.tk.model.SysLogModel;
import com.tk.model.SysLogParamModel;
import com.tk.service.SysLogService;
import com.tk.util.CommonUtil;
import com.tk.util.DateUtils;
import com.tk.util.ErrorEnum;

@RestController
@RequestMapping(value="/sys/log/")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;
	private static final Logger logger = LoggerFactory.getLogger(SysLogController.class);
	
	//获取所有日志记录
	@RequestMapping(value="/list")
	public JSONObject getLogInfo(String serviceId,String startTime,String endTime) {
		
		List<SysLogModel> logLists = new ArrayList<SysLogModel>();
		
		//处理日期
		
		startTime = DateUtils.getStartDate(startTime);
		endTime = DateUtils.getEndDate(endTime);
		
		//数据校验
		if(serviceId != null && !"".equals(serviceId)) {//服务ID不为空
			
			if(startTime == null) {//开始时间为空
				return CommonUtil.errorJson(ErrorEnum.ERROR_10000);
			}
			
			if(startTime != null && endTime != null) {//查询起期和查询止期都不为空
				
				String flag = DateUtils.compareDate(startTime, endTime);
				
				if(!"<".equals(flag)) {//不符合 查询起期 < 查询止期
					return CommonUtil.errorJson(ErrorEnum.ERROR_10001);
				}
				
			}
			
		}
		
		SysLogParamModel slpm = new SysLogParamModel(serviceId, startTime, endTime);
		
		logLists = sysLogService.getLogInfo(slpm);
		logger.info("SysLogController getLogInfo success and time is " + System.currentTimeMillis()); 
		return CommonUtil.successJson(logLists);
	}
	
	
}
