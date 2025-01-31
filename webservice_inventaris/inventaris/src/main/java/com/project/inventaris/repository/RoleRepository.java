package com.project.inventaris.repository;

import com.project.inventaris.entity.ERole;
import com.project.inventaris.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
