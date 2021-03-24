package com.example.nhs_assignment.controller;


import com.example.nhs_assignment.entity.User;
import com.example.nhs_assignment.SkillRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
public class SkillController {

    private final SkillRepository repository;

    SkillController(SkillRepository repository) {
        this.repository = repository;
    }


    @ResponseBody
    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }


    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    // Single item

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {

        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/users/{id}")
    User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {

        return repository.findById(id)
                .map(user -> {
                    user.setSkills(newUser.getSkills());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
