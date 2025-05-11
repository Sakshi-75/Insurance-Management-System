package com.insurance.management.system.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/policy")
@CrossOrigin(origins = "*")
public class PolicyController {
    @Autowired
    PolicyDetailsRepository policyDetailsRepository;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createPolicy(@RequestBody PolicyDetails policyDetails) {
        return policyDetailsRepository.save(policyDetails).getId();
    }

    @GetMapping(value = "/search/{id}")
    public PolicyDetails getPolicyDetails(@PathVariable Long id) {
        return policyDetailsRepository.findById(id).orElse(null);
    }

    @GetMapping(value = "/all")
    public List<PolicyDetails> getAllPolicyDetails() {
        return policyDetailsRepository.findAll();
    }
}
