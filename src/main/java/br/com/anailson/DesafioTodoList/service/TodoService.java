package br.com.anailson.DesafioTodoList.service;

import br.com.anailson.DesafioTodoList.entity.Todo;
import br.com.anailson.DesafioTodoList.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
    }
    public List<Todo> list(){
        sORT SORT =Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        todoRepository.findAll();
    }
    public List<Todo> update(){

    }
    public List<Todo> delete(){

    }
}


