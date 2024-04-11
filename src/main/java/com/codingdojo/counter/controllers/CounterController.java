package com.codingdojo.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.servlet.http.HttpSession;


@Controller
public class CounterController {
	@RequestMapping ("/")
	public String index(HttpSession session){
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);			
		}else {
			int num = (int) session.getAttribute("count");
			num++;
			session.setAttribute("count", num);
		}
		return "index.jsp";
	}
	@RequestMapping ("/counter")
	public String visit(HttpSession session){
		session.getAttribute("count");
	return "results.jsp";
	}

}
