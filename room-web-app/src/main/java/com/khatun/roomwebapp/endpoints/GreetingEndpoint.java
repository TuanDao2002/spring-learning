package com.khatun.roomwebapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

//Create a custom endpoint for actuator
//Link: http://localhost:8080/actuator/greeting (/actuator/{id})
@Component
@Endpoint(id="greeting")
public class GreetingEndpoint {
    @ReadOperation
    public String getGreeting() {
        return "Hello from actuator";
    }
}
