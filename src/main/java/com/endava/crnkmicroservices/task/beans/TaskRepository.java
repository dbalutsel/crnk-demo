package com.endava.crnkmicroservices.task.beans;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TaskRepository extends InMemoryResourceRepository<Task, Long> {

	public TaskRepository() {
		super(Task.class);
	}
}
