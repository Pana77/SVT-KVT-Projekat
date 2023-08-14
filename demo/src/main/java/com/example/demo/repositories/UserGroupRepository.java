package com.example.demo.repositories;

import com.example.demo.models.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

    List<UserGroup> findByUserId(Long userId);

    List<UserGroup> findByGroupId(Long id);

    Optional<UserGroup> findByUserIdAndGroupId(Long userId, Long groupId);

    boolean existsByUserIdAndAndGroupId(Long userId, Long groupId);
}
