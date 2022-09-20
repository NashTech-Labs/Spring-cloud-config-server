package main.clientservice.controller;

import main.clientservice.bean.Credentials;
import main.clientservice.configurations.Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientServiceController {
    @Autowired
    Configurations configurations;

    @GetMapping("/get-credentials")
    public Credentials getCredentials() {
        return new Credentials(configurations.getUsername(), configurations.getPassword());
    }

}
