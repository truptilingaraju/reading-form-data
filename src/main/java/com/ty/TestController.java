package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {

	@PostMapping("/save")
	public ModelAndView register(HttpServletRequest request) {
		
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String age=request.getParameter("user_age");
		String gender=request.getParameter("user_gender");
		
		ModelAndView view=new ModelAndView("display.jsp");
		view.addObject("student_name", name);
		view.addObject("student_email", email);
		view.addObject("student_age",age);
		view.addObject("student_gender", gender);
		
		return view;
	}
}
