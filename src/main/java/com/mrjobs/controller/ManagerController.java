package com.mrjobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mrjobs.enums.AttributeTypeEnum;
import com.mrjobs.enums.PageEnum;

@Controller
public class ManagerController extends GenericController{

	@RequestMapping(value = "/", method = RequestMethod.GET)
	private ModelAndView index(Model model) throws Exception {		
		model = setValues(model, AttributeTypeEnum.MESSAGE, "Hi! Welcome.");
		model = setValues(model, AttributeTypeEnum.PAGE, PageEnum.INDEX.value);
		return new ModelAndView("/page");
	}
	
	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
	private ModelAndView loadPage(@PathVariable("page") String page, Model model) throws Exception {
		
		PageEnum pageEnum = loadPage(page);
		
		if(pageEnum != null) {		
			model = setValues(model, AttributeTypeEnum.PAGE, pageEnum.value);			
		}else {		
			model = setValues(model, AttributeTypeEnum.PAGE, PageEnum.NOT_FOUND.value);			
		}
		
		return new ModelAndView("/page");
	}
}