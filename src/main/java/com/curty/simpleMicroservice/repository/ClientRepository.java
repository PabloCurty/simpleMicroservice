package com.curty.simpleMicroservice.repository;

import com.curty.simpleMicroservice.domail.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
