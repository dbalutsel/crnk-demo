package com.endava.projects.beans;


import io.crnk.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

//@Component
public class ProjectRepository extends JpaEntityRepositoryBase<Project, Long> {

	public ProjectRepository() {
		super(Project.class);
	}

//
//	@Override
//	@Transactional
//	public <S extends Project> S save(S resource) {
//		return super.save(resource);
//	}
//
//	@Override
//	@Transactional
//	public <S extends Project> S create(S resource) {
//		return super.create(resource);
//	}
}
