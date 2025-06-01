package com.kshitij.todo.repository;

import com.kshitij.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // We get CRUD methods for free (save, findById, findAll, deleteById, etc.)
}
