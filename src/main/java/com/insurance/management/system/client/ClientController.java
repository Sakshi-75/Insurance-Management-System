package com.insurance.management.system.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    ClientDetailsRepository clientDetailsRepository;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createClient(@RequestBody ClientDetails clientDetails) {
        return clientDetailsRepository.save(clientDetails).getId();
    }

}
