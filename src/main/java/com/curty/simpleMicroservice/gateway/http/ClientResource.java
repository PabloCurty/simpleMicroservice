package com.curty.simpleMicroservice.gateway.http;

import com.curty.simpleMicroservice.gateway.dto.ClientDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Log4j2
public class ClientResource {

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
    }
}
