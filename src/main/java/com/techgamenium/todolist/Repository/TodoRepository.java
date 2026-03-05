package com.techgamenium.todolist.Repository;

import com.techgamenium.todolist.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}