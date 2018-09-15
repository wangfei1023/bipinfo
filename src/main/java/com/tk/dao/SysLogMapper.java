package com.tk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tk.model.SysLogModel;
import com.tk.model.SysLogParamModel;
@Mapper
public interface SysLogMapper {
	
	public List<SysLogModel> getLogInfo(SysLogParamModel sysLogParamModel);
	
	
}
