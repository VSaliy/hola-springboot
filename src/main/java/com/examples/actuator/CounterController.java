package com.examples.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vitaliy Saliy
 */
@Controller
public class CounterController {

    @Autowired
    private CounterService counterService;

    @RequestMapping(value = "/devrement")
    public String decrement() {
        counterService.increment("important.counter");
        return "Decremented";
    }

    @RequestMapping(value = "/invrement")
    public String increment() {
        counterService.increment("important.counter");
        return "Incremented";
    }
}
