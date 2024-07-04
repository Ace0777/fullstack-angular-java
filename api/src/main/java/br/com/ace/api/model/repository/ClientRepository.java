package br.com.ace.api.model.repository;

import br.com.ace.api.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
