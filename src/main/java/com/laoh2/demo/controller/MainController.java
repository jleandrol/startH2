package com.laoh2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {

    @GetMapping()
    public String get() {
        return "Hi!<br><br>" +
        "<p><a href='http://localhost:8080/h2-console/login.do'>H2 console</a>" +
        "<p><a href='http://localhost:8080/v1/country/'>Get all...</a><br>" +
        "<p><a href='http://localhost:8080/v1/country/3'>Get item 3 ...</a><br>" +
        "<p><a href='http://localhost:8080/v1/country/last/3'>Get last update date of item 3 ...</a><br>";
    }
}
