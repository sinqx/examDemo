package com.exam2.demo.service;

import com.exam2.demo.entity.Requests;
import com.exam2.demo.repository.RequestsPerository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RequestsServiceImpl implements RequestsService{
    @Autowired
    private RequestsPerository requestsPerository;

    @Autowired
    public Requests save(Requests request){
        return requestsPerository.save(request).orElse(null); //Выходит неизвестная ошибка, не могу ее решить, но вроде всё правильно написал
        // Inferred type 'S' for type parameter 'S' is not within its bound; should extend 'org.apache.catalina.connector.Request
    }

    @Override
    public Requests save(String name) {
        Requests request = Requests.builder()
                .time(LocalDateTime.now())
                .requestType(name)
                .build();
        return requestsPerository.save(request).orElse(null);
    }

    @Override
    public List<Requests> getAllRequests() {
        return requestsPerository.findAll();
    }

    @Override
    public long count() {
        return requestsPerository.count();
    }
}
