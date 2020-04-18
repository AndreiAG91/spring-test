package com.ag.testtask.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.testtask.service.NonRenewableRandomNumberService;
import com.ag.testtask.service.ProjectBuildInfoService;
import com.ag.testtask.service.RenewableRandomNumberService;

@RestController
public class MainController {
	
	@Autowired
	private ProjectBuildInfoService projectBuildInfoService;
	@Autowired
	private NonRenewableRandomNumberService nonRenewableRandomNumberService;
	@Autowired
	private RenewableRandomNumberService renewableRandomNumberService;
	
	@GetMapping
	public String main() {
		return "<ol>"
			+ "<li><a href=\"/projectBuildTime\">Project Build Time</a></li>"
			+ "<li><a href=\"/randomNumberOnce\">Random Number Once</a></li>"
			+ "<li><a href=\"/randomNumberEachTime\">Random Number Each Time</a></li>"
			+ "</ol>";
	}
	
	@GetMapping("/projectBuildTime")
	public String getProjectBuildTime() {
		long projectBuildTime = projectBuildInfoService.getProjectBuildTime();
		return new Date(projectBuildTime).toString();
	}
	
	@GetMapping("/randomNumberOnce")
	public String getRandomNumberOnce() {
		return "Random Number: " + nonRenewableRandomNumberService.getRandomNumber();
	}
	
	@GetMapping("/randomNumberEachTime")
	public String getRandomNumberEachTime() {
		return "Random Number: " + renewableRandomNumberService.getRandomNumber();
	}
}
