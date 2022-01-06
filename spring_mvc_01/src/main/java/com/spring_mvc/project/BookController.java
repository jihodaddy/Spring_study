package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@RequestMapping("book/bookInfoView1") //bookInfoView1요청 들어오면 jsp파일 없어도 bookInfoView에 매핑
	public String showBookInfo1(Model model) {
		model.addAttribute("bookName", "스프링 프레임워크");
		model.addAttribute("bookPrice", 20000);
		return "book/bookInfoView";
	}
	
	@RequestMapping("book/bookInfoView2")
	public ModelAndView showBookInfo2(ModelAndView mv) {
		mv.addObject("bookName", "MVC모델 프로젝트");
		mv.addObject("bookPrice", 30000);
		
		mv.setViewName("book/bookInfoView");
		
		return mv;
	}
	
	//다중 매핑
	@RequestMapping({"/bookInfoView3", "/bookInfoView4"})
	public String showBookInfo34(HttpServletRequest request,
													Model model) {
		if(request.getServletPath().equals("/bookInfoView3")) {
			model.addAttribute("title" , "영어회화");
			model.addAttribute("price" , 30000);
		}else if(request.getServletPath().equals("/bookInfoView4")) {
			model.addAttribute("title", "수학정석");
			model.addAttribute("price", 40000);
		}
		
		return "book/bookInfoView";
	}
}
