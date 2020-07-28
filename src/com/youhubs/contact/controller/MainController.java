package com.youhubs.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.youhubs.contact.dao.ContactDAO;
import com.youhubs.contact.model.Contact;

@Controller
public class MainController {

	@Autowired
	private ContactDAO contactDAO;

	@RequestMapping(value = "/")
	public ModelAndView listContact(ModelAndView model) {
		List<Contact> listContact = contactDAO.list();
		model.addObject("listContact", listContact);
		model.setViewName("index");

		return model;
	}

}
