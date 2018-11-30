package com.mrjobs.enums;

public enum PageEnum {

	INDEX("index"), 
	LOGIN("login"),
	NOT_FOUND("not-found");
	
	public String value;
	
	PageEnum(String value) {
		this.value = value;
	}
}