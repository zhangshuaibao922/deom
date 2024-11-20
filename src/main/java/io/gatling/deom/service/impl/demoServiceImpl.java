package io.gatling.deom.service.impl;

import io.gatling.deom.service.demoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class demoServiceImpl implements demoService {
    @Override
    public String get() {
        return "hello";
    }
}
