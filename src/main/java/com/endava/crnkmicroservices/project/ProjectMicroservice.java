package com.endava.crnkmicroservices.project;

import com.endava.crnkmicroservices.project.beans.Project;
import com.endava.crnkmicroservices.project.beans.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.endava.crnkmicroservices.project.**")
public class ProjectMicroservice {

    @Autowired
    private ProjectRepository projectRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectMicroservice.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            projectRepository.save(new Project(121L, "Great Project"));
            projectRepository.save(new Project(122L, "Crnk Project"));
            projectRepository.save(new Project(123L, "Some Project"));
            projectRepository.save(new Project(124L, "JSON API Project"));
        };
    }
}
