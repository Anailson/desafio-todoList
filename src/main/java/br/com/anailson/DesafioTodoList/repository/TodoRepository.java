package br.com.anailson.DesafioTodoList.repository;

import br.com.anailson.DesafioTodoList.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
