package com.sample.limits.model;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-svc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LimitConfiguration {
    private int maximum;
    private int minimum;
}
