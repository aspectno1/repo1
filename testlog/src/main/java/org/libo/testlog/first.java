package org.libo.testlog;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class first {
    @RequestMapping("spring")
    public String say(){
        return "spring boot";
    }
}
