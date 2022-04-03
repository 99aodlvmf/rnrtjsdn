package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	  @RequestMapping(value="/")      
	    public String main() {
	        return "index";          // 실제 호출될 /WEB-INF/jsp/main.jsp       
	}
}

