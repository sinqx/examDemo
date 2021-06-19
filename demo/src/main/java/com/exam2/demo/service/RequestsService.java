package com.exam2.demo.service;

import com.exam2.demo.entity.Requests;

import java.util.List;

public interface RequestsService {
    Requests save(Requests requests);
    Requests save (String name);
    List<Requests> getAllRequests();
    long count();
}
