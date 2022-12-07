package com.sample.limits.controller;

import com.sample.limits.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitConfiguration limits;

    @GetMapping("/limits")
    public LimitConfiguration getLimits() {
        return new LimitConfiguration(this.limits.getMinimum(), this.limits.getMaximum());
    }

}
