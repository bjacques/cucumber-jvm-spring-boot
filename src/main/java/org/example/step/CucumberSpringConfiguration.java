package org.example.step;

import io.cucumber.spring.CucumberContextConfiguration;
import org.example.config.Config;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
//@ContextConfiguration(classes = { Config.class })
@SpringBootTest(classes = Config.class)
//@ContextConfiguration("classpath:cucumber.xml")
public class CucumberSpringConfiguration {
}
