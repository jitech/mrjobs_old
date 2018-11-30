package com.mrjobs.controller;

import com.mrjobs.enums.AttributeTypeEnum;
import com.mrjobs.enums.PageEnum;

public class GenericController {
	
	public String loadAttribute(AttributeTypeEnum attribute) {
		return attribute.value;
	}
	
	public String loadPage(PageEnum page) {
		return page.value;
	}
}