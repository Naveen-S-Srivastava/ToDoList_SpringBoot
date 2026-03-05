package com.techgamenium.todolist.Service;

import com.techgamenium.todolist.Model.Todo;
import com.techgamenium.todolist.Repository.TodoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public Todo addTodo(Todo todo){
        return repository.save(todo);
    }

    public List<Todo> getTodos(){
        return repository.findAll();
    }

    public void deleteTodo(Long id){
        repository.deleteById(id);
    }
}