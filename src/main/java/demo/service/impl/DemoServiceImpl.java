package demo.service.impl;

import demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getName(String name) {
        return "hello " + name;
    }
}
