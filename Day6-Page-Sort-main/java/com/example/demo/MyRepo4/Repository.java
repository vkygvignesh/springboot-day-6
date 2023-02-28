package com.example.demo.MyRepo4;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Child;

public interface Repository extends JpaRepository<Child, Long> {

}
