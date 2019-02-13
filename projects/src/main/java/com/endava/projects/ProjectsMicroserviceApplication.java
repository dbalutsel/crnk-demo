package com.endava.projects;

import io.crnk.core.engine.transaction.TransactionRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.concurrent.Callable;

@SpringBootApplication
public class ProjectsMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectsMicroserviceApplication.class, args);
    }

 }

