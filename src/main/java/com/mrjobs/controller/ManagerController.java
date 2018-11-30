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
		model.addAttribute(loadAttribute(AttributeTypeEnum.MESSAGE), "Hi! Welcome.");
		model.addAttribute(loadAttribute(AttributeTypeEnum.PAGE), loadPage(PageEnum.INDEX));
		return new ModelAndView("/page");
	}
	
	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
	private ModelAndView loadPage(@PathVariable("page") String page, Model model) throws Exception {
		
		if(PageEnum.valueOf(page) != null) {
			model.addAttribute(loadAttribute(AttributeTypeEnum.PAGE), loadPage(PageEnum.valueOf(page)));
		}else {
			model.addAttribute(loadAttribute(AttributeTypeEnum.PAGE), loadPage(PageEnum.NOT_FOUND));
			
		}
		
		return new ModelAndView("/page");
	}
}