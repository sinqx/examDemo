package com.exam2.demo.controller;

import com.exam2.demo.entity.Requests;
import com.exam2.demo.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestsController {
    @Autowired
    private RequestsService requestsService;

    @GetMapping("/counter")
    private long count(){ return requestsService.count(); }

    @GetMapping("/report")
    private List<Requests> report(){ return requestsService.getAllRequests(); }
}
