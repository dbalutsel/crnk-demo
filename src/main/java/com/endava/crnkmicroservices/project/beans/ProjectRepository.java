package com.endava.crnkmicroservices.project.beans;


import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProjectRepository extends InMemoryResourceRepository<Project, Long> {

	public ProjectRepository() {
		super(Project.class);
	}

}
