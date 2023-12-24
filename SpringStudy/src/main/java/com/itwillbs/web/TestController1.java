package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController1 {

	private static final Logger logger = LoggerFactory.getLogger(TestController1.class);

	/*
	 * // http://localhost:8080/web/Minji
	 * 
	 * @RequestMapping(value="/Minji", method = RequestMethod.GET) public String
	 * Minji() {
	 * 
	 * return "redirect:/Hani"; }
	 * 
	 * @RequestMapping(value ="/Hani", method =RequestMethod.GET) public void Hani()
	 * { System.out.println("Minji-> Hani"); }
	 */

//	http://localhost:8080/web/NewJeans
//	http://localhost:8080/web/NewJeans=Haerin&NewJeans=Hani
	
	@RequestMapping(value = "/NewJeans", method = RequestMethod.GET)
	public String NewJeans(RedirectAttributes rttr) {
		rttr.addFlashAttribute("NewJeans", "NewJeans");
	
//	@RequestMapping(value = "/NewJeans", method = RequestMethod.GET)
//	public String NewJeans(Model model) {
//		model.addAttribute("NewJeans", "Hearin");
		return  "redirect:/Member";
	}


	@RequestMapping(value = "/Member", method = RequestMethod.GET)
	public void Member(@ModelAttribute("NewJeans") String NewJeans) {
		logger.debug("msg: " + NewJeans);
	}
	
		
} // TestController1
