package com.endava.projects.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.*;
import io.crnk.core.resource.links.DefaultSelfLinksInformation;

@JsonApiResource(type = "task")
public class Task {

	@JsonApiId
	private Long id;

	@JsonProperty
	private String name;

	@JsonApiRelationId
	private Long projectId;

	@JsonApiRelation(serialize = SerializeType.ONLY_ID, lookUp = LookupIncludeBehavior.AUTOMATICALLY_WHEN_NULL)
	private Project project;

	@JsonApiLinksInformation
	private DefaultSelfLinksInformation links = new DefaultSelfLinksInformation();

	public Task() {
	}

	public Task(Long id, String name, Long projectId) {
		this.id = id;
		this.name = name;
		this.projectId = projectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public DefaultSelfLinksInformation getLinks() {
		return links;
	}

	public void setLinks(DefaultSelfLinksInformation links) {
		this.links = links;
	}
}
