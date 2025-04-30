package com.tasks.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tasks.Entity.Tasks;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tasks.Entity.Tasks;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {
    // No custom methods needed for basic CRUD
}
