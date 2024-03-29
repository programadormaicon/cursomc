package com.maicon.cursomc.resources.exception;

import java.io.Serializable;

public class StandartError implements Serializable{
    

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStamp;
    
    
	public StandartError(Integer status, Long timeStamp, String msg) {
		super();
		this.status = status;
		this.timeStamp = timeStamp;
		this.msg = msg;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
    
   

}
