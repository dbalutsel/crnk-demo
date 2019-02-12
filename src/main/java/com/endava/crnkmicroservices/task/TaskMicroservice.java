package com.endava.crnkmicroservices.task;

import com.endava.crnkmicroservices.task.beans.Task;
import com.endava.crnkmicroservices.task.beans.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskMicroservice {

    @Autowired
    private TaskRepository taskRepository;

    public static void main(String[] args) {
        SpringApplication.run(TaskMicroservice.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            taskRepository.save(new Task(221L, "Great Task", 121L));
            taskRepository.save(new Task(222L, "Crnk Task", 121L));
            taskRepository.save(new Task(223L, "Some Task", 121L));
            taskRepository.save(new Task(224L, "JSON API Task", 121L));
        };
    }
}
