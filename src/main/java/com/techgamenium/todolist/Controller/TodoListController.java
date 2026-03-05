package com.techgamenium.todolist.Controller;

import com.techgamenium.todolist.Model.Todo;
import com.techgamenium.todolist.Service.TodoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoListController {

    private final TodoService service;

    public TodoListController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return service.addTodo(todo);
    }

    @GetMapping
    public List<Todo> getTodos(){
        return service.getTodos();
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id){
        service.deleteTodo(id);
        return "DONE BETA";
    }
}