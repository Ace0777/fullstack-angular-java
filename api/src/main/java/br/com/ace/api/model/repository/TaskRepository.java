package br.com.ace.api.model.repository;

import br.com.ace.api.model.entity.Client;
import br.com.ace.api.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
