package exams.rest;

import org.springframework.beans.factory.annotation.Value;

import exams.service.StatisticService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/api")
@RestController
public class StatisticResource {
    private static final String GREETING_CONTROLLER_MAPPING = "/examStatistic";
    private final StatisticService service;
    private final String baseUrl;

    public StatisticResource(StatisticService service, @Value("${application.base-url}") String baseUrl) {
        this.service = service;
        this.baseUrl = baseUrl;
    }

    @GetMapping("/statistics")
    public String getHelloWorldGreeting() {
        System.out.println("what");
        //System.out.println(service.findAllGreetings());
        //return ResponseUtil.wrapOrNotFound(service.findGreetingById(greetingId));
        return "what";
    }

    //todo this is a mock rest service, change it!
    @GetMapping("/exams")
    public List<String> getExams(){
        return Arrays.asList("Math", "Chemistry", "Physics", "Whatever", "Science");
    }
}
