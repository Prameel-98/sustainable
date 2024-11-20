package com.klef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
       
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	
	
	
	@GetMapping("/rewards")
	public String reward()
	{
		return "rewards";
	}
	
	@GetMapping("/product")
	public String product()
	{
		return "product";
	}
	@GetMapping("/what")
    public String getSustainabilityPage() {
        return "what";  // This should match the file name 'what.html' in templates folder
    }
	
	@GetMapping("/video")
    public String getVideo() {
        return "video";  // This should match the file name 'what.html' in templates folder
    }
	
	@GetMapping("/why")
    public String getWhySustainabilityPage() {
        return "why";
	}
	@Controller
	public class ProfileController {

	    @GetMapping("/profile")
	    public String showProfile() {
	        return "profile";  // This will resolve to src/main/resources/templates/profile.html
	    }
	}
	
	@Controller
	public class QueryController {

	    @GetMapping("/queries")
	    public String showQueryPage() {
	        return "queries";  // This returns queries.html in the templates folder
	    }
	}
	@Controller
	public class TypesController {

	    @GetMapping("/resources")
	    public String getTypes() {
	        return "resources";  // "types" maps to types.html in the templates directory
	    }
	}
	
	
	

}
