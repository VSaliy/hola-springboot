package com.examples.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Vitaliy Saliy
 */
@Component
public class HealthCheck implements HealthIndicator {

    private Random random = new Random();

    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down()
                    .withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    public int check() {
        int result = 0;

        if (random.nextBoolean()) {
            result = 42;
        }

        return result;
    }
}
