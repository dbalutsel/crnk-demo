package com.endava.tasks.beans;

import io.crnk.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Component
public class TaskRepository extends JpaEntityRepositoryBase<Task, Long> {

	public TaskRepository() {
		super(Task.class);
	}
}
