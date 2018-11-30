package com.mrjobs.enums;

public enum PageEnum {

	INDEX("index"), 
	LOGIN("login"),
	DASH("dash"),
	NOT_FOUND("not-found");
	
	public String value;
	
	PageEnum(String value) {
		this.value = value;
	}
}