package com.project.inventaris.repository;

import com.project.inventaris.dto.UserDto;
import com.project.inventaris.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
    boolean existsByEmail(String email);
    public List<User> findByNameContainingOrNimContainingOrKelasContainingOrEmailContainingIgnoreCase(String name, String nim, String kelas, String email);
}
