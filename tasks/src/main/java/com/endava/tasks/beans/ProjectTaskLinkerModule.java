package com.endava.tasks.beans;

import io.crnk.client.CrnkClient;
import io.crnk.core.module.Module;
import io.crnk.core.repository.ResourceRepositoryV2;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ProjectTaskLinkerModule implements Module {
    @Override
    public String getModuleName() {
        return "ProjectTaskLinkerModule";
    }

    @Override
    public void setupModule(ModuleContext context) {
        CrnkClient client = new CrnkClient("http://localhost:8081");
        ResourceRepositoryV2<Project, Serializable> remoteProjectRepository = client.getRepositoryForType(Project.class);
        context.addRepository(remoteProjectRepository);
    }
}
