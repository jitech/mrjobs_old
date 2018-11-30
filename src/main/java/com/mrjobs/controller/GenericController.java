package com.mrjobs.controller;

import org.springframework.ui.Model;

import com.mrjobs.enums.AttributeTypeEnum;
import com.mrjobs.enums.PageEnum;

public class GenericController {
	
	public Model setValues(Model model, AttributeTypeEnum attributeTypeEnum, Object value) {
		model.addAttribute(attributeTypeEnum.value, value);
		return model;
	}
	
	public PageEnum loadPage(String value) {
		
		for(PageEnum page : PageEnum.values()) {
			
			if(page.value.equals(value)) {
				return page;
			}
		}
		
		return null;
	}
}