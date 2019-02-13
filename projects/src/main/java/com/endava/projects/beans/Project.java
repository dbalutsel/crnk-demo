package com.endava.projects.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.*;
import io.crnk.core.resource.links.DefaultSelfLinksInformation;

import java.util.List;

@JsonApiResource(type = "project")
public class Project {

	@JsonApiId
	private Long id;

	@JsonProperty
	private String name;

	@JsonApiRelation(serialize = SerializeType.EAGER, lookUp = LookupIncludeBehavior.AUTOMATICALLY_WHEN_NULL,
			repositoryBehavior = RelationshipRepositoryBehavior.FORWARD_OPPOSITE, opposite = "project")
	private List<Task> task;
	/**
	 * Links information necessary on objects to maintain urls from original microservice.
	 */
	@JsonApiLinksInformation
	private DefaultSelfLinksInformation links = new DefaultSelfLinksInformation();

	public Project() {
	}

	public Project(Long id, String name) {
		this.id = id;
		this.name = name;
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

	public DefaultSelfLinksInformation getLinks() {
		return links;
	}

	public void setLinks(DefaultSelfLinksInformation links) {
		this.links = links;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}
}
