package org.example.step;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java8.En;

public class MyStep implements En {

    private static final Logger log = LoggerFactory.getLogger(MyStep.class);

    public MyStep() {
        Given("A", () ->
        {
            log.info(() -> "Given");
        });

        When("B", () -> {

        });

        Then("C", () -> {

        });
    }
}
