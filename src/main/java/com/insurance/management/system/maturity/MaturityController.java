package com.insurance.management.system.maturity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/search/{id}")
    public MaturityDetails getMaturityDetails(@PathVariable Long id) {
        return maturityDetailsRepository.findById(id).orElse(null);
    }

    @GetMapping(value = "/all")
    public List<MaturityDetails> getAllMaturityDetails() {
        return maturityDetailsRepository.findAll();
    }
}
