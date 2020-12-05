package com.curty.simpleMicroservice.service;

import com.curty.simpleMicroservice.domail.Client;
import com.curty.simpleMicroservice.repository.ClientRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CreateClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void execute(Client client){
        log.info("Create client");
        clientRepository.save(client);
        log.info("Saved client with id = " + client.getId());
    }
}
