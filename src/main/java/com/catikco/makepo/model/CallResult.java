package com.catikco.makepo.model;

/**
 * 
 * @author lfg
 * 后端台响应model
 *
 */
public class CallResult<T> {

	private boolean success;		//调用是否成功
	private String code;			//结果代码
	private String detail;			//附加说明
	private T data;				//数据
	
	
	public CallResult() {
		
		this.success = false;
		this.data = null;
		
	}
	
	public CallResult(boolean result) {
		
		this.success = result;
	}
	
	public CallResult(boolean result, String detail, T data) {
		
		this.success = result;
		this.detail = detail;
		this.data = data;
		
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean isSuccess) {
		this.success = isSuccess;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
