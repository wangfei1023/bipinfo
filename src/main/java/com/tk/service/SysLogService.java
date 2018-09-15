package com.tk.service;

import java.util.List;

import com.tk.model.SysLogModel;
import com.tk.model.SysLogParamModel;

public interface SysLogService {

	//获取日志
	public List<SysLogModel> getLogInfo(SysLogParamModel sysLogParamModel);
}
