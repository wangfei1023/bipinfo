package com.tk.model;


/**
 * 日志记录类
 * 
 * @author WolfGo
 *
 */

public class SysLogModel {

	//服务id
	private String serviceId;
	
	//服务访问量
	private Integer serviceCount;

	public SysLogModel() {
		super();
	}

	public SysLogModel(String serviceId, Integer serviceCount) {
		super();
		this.serviceId = serviceId;
		this.serviceCount = serviceCount;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getServiceCount() {
		return serviceCount;
	}

	public void setServiceCount(Integer serviceCount) {
		this.serviceCount = serviceCount;
	}

	
	
}
