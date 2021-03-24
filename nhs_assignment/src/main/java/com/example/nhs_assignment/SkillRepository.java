package com.example.nhs_assignment;

import com.example.nhs_assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<User, Long> {
}
