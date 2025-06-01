package com.kshitij.todo.controller;

import com.kshitij.todo.model.Todo;
import com.kshitij.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*") // For testing with Postman or frontend running elsewhere
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
        return todoService.getTodoById(id).map(todo -> {
            todo.setTitle(todoDetails.getTitle());
            todo.setCompleted(todoDetails.isCompleted());
            Todo updatedTodo = todoService.saveTodo(todo);
            return ResponseEntity.ok(updatedTodo);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        if (todoService.getTodoById(id).isPresent()) {
            todoService.deleteTodo(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
