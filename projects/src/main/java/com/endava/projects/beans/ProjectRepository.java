package com.endava.projects.beans;


import io.crnk.core.repository.InMemoryResourceRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepository extends InMemoryResourceRepository<Project, Long> {

	public ProjectRepository() {
		super(Project.class);
	}

}
