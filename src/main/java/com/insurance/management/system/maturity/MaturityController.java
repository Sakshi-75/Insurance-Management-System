package com.insurance.management.system.maturity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maturity")
public class MaturityController {
    @Autowired
    MaturityDetailsRepository maturityDetailsRepository;

    @PostMapping(value = "/create")
    public Long create(@RequestBody MaturityDetails maturityDetails) {
        return maturityDetailsRepository.save(maturityDetails).getId();
    }
}
