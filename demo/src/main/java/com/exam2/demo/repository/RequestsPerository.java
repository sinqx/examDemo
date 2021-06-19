package com.exam2.demo.repository;

import org.apache.catalina.connector.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsPerository extends JpaRepository<Request, Long> {
}
