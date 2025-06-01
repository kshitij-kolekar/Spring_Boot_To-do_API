package com.kshitij.todo.service;

import com.kshitij.todo.model.Todo;
import com.kshitij.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // Get all todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Get todo by ID
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // Create or update todo
    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // Delete todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
