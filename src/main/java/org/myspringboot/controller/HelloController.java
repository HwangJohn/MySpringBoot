package org.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <pre>
 *      org.myspringboot.controller
 *        |_ HelloController.java
 * </pre>
 * <p/>
 * <pre>
 *
 * </pre>
 *
 * @Company :
 * @Author : 황중원
 * @Date : 2016. 3. 9.
 * @Version : 1.0
 */
@Controller
@RestController
public class HelloController {

	private static final String STAT0001_PAGE_NAME = "index.html";


	@RequestMapping(value="", method= RequestMethod.GET)
	public ModelAndView callUserListPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName(STAT0001_PAGE_NAME);
		return mav;
	}


}
