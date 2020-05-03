package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.LiveDto;

public interface LiveRepository extends JpaRepository<LiveDto, Integer>{

	@Query(value = "SELECT * FROM m_live WHERE live_area_no = :area_no AND live_date_time >= :month_start AND live_date_time <= :month_end ;", nativeQuery = true)
	public List<LiveDto> findSearchEvent(@Param("month_start") String month_start, @Param("month_end") String month_end, @Param("area_no") int area_no);

}