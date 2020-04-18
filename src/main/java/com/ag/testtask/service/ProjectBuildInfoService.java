package com.ag.testtask.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:build-info")
public class ProjectBuildInfoService {
	
	@Value("${project-build-time}")
	private long projectBuildTime;
	
	public long getProjectBuildTime() {
		return projectBuildTime;
	}
}
