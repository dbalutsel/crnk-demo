package com.endava.crnkmicroservices.client;

import com.endava.crnkmicroservices.project.beans.Project;
import com.endava.crnkmicroservices.project.beans.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ClientConsumer.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {

        };
    }
}
