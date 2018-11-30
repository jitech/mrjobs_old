package com.mrjobs.enums;

public enum AttributeTypeEnum {

	MESSAGE("message"),  
	PAGE("page");
	
	public String value;
	
	AttributeTypeEnum(String value) {
		this.value = value;
	}
}