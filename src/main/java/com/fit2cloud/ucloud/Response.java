package com.fit2cloud.ucloud;

public class Response {
	
	private String Action;
	private String RetCode;
	private String Message;
	private int TotalCount;

	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getRetCode() {
		return RetCode;
	}

	public void setRetCode(String retCode) {
		RetCode = retCode;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "Response{" +
				"Action='" + Action + '\'' +
				", RetCode='" + RetCode + '\'' +
				", TotalCount=" + TotalCount +
				'}';
	}
}
