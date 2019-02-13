package com.endava.tasks.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.*;
import io.crnk.core.resource.links.DefaultSelfLinksInformation;

import javax.persistence.*;

@Entity
@Table(name = "t_task", schema = "public")
//@JsonApiResource(type = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@JsonApiId
	private Long id;

	//@JsonProperty
	@Column(name = "name")
	private String name;

	@JsonApiRelationId
	@Column(name = "project_id")
	private Long projectId;

	@Transient
	@JsonApiRelation(serialize = SerializeType.ONLY_ID, lookUp = LookupIncludeBehavior.AUTOMATICALLY_WHEN_NULL)
	private Project project;

	@Transient
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
