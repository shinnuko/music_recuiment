package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.LiveDto;

public interface LiveRepojitory extends JpaRepository<LiveDto, Integer>{

}
