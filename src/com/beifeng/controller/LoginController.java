package com.beifeng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String userName = request.getParameter("userName");
		String userPw = request.getParameter("userPw");
		System.out.println("------����springMVC�Ŀ�����---------");
		System.out.println("�˺ţ�"+userName);
		System.out.println("�˺ţ�"+userPw);
		
		ModelAndView mav = new ModelAndView("index");
		
		//ģ�����Model
		if("admin".equals(userName) && "123".equals(userPw)){
			mav.addObject("message", "�û���¼�ɹ�!");
		}else{
			mav.addObject("message", "�˺Ż��������");
		}
	
		
		return mav;
	}

}
