package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.RegisterEntity;

public interface RegisterRepo extends JpaRepository<RegisterEntity, Integer>{

}
