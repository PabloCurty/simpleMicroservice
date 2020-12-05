package com.curty.simpleMicroservice.gateway.http;

import com.curty.simpleMicroservice.domail.Client;
import com.curty.simpleMicroservice.gateway.dto.ClientDTO;
import com.curty.simpleMicroservice.repository.ClientRepository;
import com.curty.simpleMicroservice.service.CreateClientService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class ClientResource {

    @Autowired
    private CreateClientService createClient;

    //TODO alterar, má prática, correto é construir service para solicitar a lista de clientes
    @Autowired
    private ClientRepository clientRepository;

    private ModelMapper mp;

    @GetMapping("my/client")
    public ClientDTO getClient(){
        ClientDTO dto = ClientDTO
                .builder()
                .id(1L)
                .name("Fulano")
                .build();
        log.info("return: " + dto);
        return dto;
    }

    @PostMapping("my/client")
    public void setClient(@Valid @RequestBody ClientDTO dto){
        log.info("client name is: " + dto.getName());
        mp = new ModelMapper();
        createClient.execute(mp.map(dto, Client.class));
    }

    @GetMapping("my/clients")
    public List<ClientDTO> getMyClients(){
        mp = new ModelMapper();
        //TODO alterar, má prática, correto é construir service para solicitar a lista de clientes
        return mp.map(clientRepository.findAll(), ArrayList.class);
    }
}
