package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.LiveHouseDto;

public interface LiveHouseRepository extends JpaRepository<LiveHouseDto, Integer> {

}
