package com.endava.crnkmicroservices;

import com.endava.crnkmicroservices.client.ClientConsumer;
import com.endava.crnkmicroservices.project.ProjectMicroservice;
import com.endava.crnkmicroservices.task.TaskMicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

public class CrnkMicroservicesApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication project = new SpringApplication(ProjectMicroservice.class);
        project.setDefaultProperties(new HashMap<String, Object>(){
            {
                put("server.port", "8081");
            }
        });
        project.run();

        SpringApplication task = new SpringApplication(TaskMicroservice.class);
        task.setDefaultProperties(new HashMap<String, Object>(){
            {
                put("server.port", "8082");
            }
        });
        task.run();

        Thread.sleep(2000L);
        SpringApplication client = new SpringApplication(ClientConsumer.class);
        client.setDefaultProperties(new HashMap<String, Object>(){
            {
                put("server.port", "8083");
            }
        });
        client.run();
    }

}

