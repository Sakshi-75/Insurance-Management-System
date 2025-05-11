package com.insurance.management.system.maturity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/maturity")
@CrossOrigin(origins = "*")
public class MaturityController {
    @Autowired
    MaturityDetailsRepository maturityDetailsRepository;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody MaturityDetails maturityDetails) {
        return maturityDetailsRepository.save(maturityDetails).getId();
    }
}
