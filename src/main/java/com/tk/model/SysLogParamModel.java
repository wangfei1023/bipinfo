package com.tk.model;

/**
 * 查询日志参数类
 * @author WolfGo
 *
 */
public class SysLogParamModel {

	//服务ID
	private String serviceId;
	
	//查询起期
	private String startTime;
	
	//查询止期
	private String endTime;

	public SysLogParamModel() {
		super();
	}

	public SysLogParamModel(String serviceId, String startTime, String endTime) {
		super();
		this.serviceId = serviceId;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	
	
	
}
