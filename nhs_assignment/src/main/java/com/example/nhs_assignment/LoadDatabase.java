package com.example.nhs_assignment;

import com.example.nhs_assignment.entity.Expertise;
import com.example.nhs_assignment.entity.Skill;
import com.example.nhs_assignment.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);



    @Bean
    CommandLineRunner initDatabase(SkillRepository repository) {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Java", Expertise.EXPERT));
        skills.add(new Skill("Node.js", Expertise.PRACTITIONER));
        return args -> {
            log.info("Preloading " + repository.save(new User(skills)));
            log.info("Preloading " + repository.save(new User(skills)));
        };
    }
}
