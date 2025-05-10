package com.insurance.management.system.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/policy")
public class PolicyController {
    @Autowired
    PolicyDetailsRepository policyDetailsRepository;

    @PostMapping(value = "/money-back")
    public Long createPolicy(@RequestBody PolicyDetails policyDetails) {
        return policyDetailsRepository.save(policyDetails).getId();
    }
}
