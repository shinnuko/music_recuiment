package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LiveDto;

@Service
public class LiveDao implements LiveRepository {

	@Autowired
	LiveRepository live;
	
	public List<LiveDto> findSearchEvent(String monthStart, String monthEnd, int areaNo) {
		return live.findSearchEvent(monthStart, monthEnd, areaNo);
	}

	@Override
	public List<LiveDto> findAll() {
		return live.findAll();
	}

	@Override
	public List<LiveDto> findAll(Sort sort) {
		return live.findAll();
	}

	@Override
	public List<LiveDto> findAllById(Iterable<Integer> ids) {
		return live.findAllById(ids);
	}

	@Override
	public <S extends LiveDto> List<S> saveAll(Iterable<S> entities) {
		return live.saveAll(entities);
	}

	@Override
	public void flush() {
		live.flush();
	}

	@Override
	public <S extends LiveDto> S saveAndFlush(S entity) {
		return live.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<LiveDto> entities) {
		live.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		live.deleteAllInBatch();
	}

	@Override
	public LiveDto getOne(Integer id) {
		return live.getOne(id);
	}

	@Override
	public <S extends LiveDto> List<S> findAll(Example<S> example) {
		return live.findAll(example);
	}

	@Override
	public <S extends LiveDto> List<S> findAll(Example<S> example, Sort sort) {
		return live.findAll(example, sort);
	}

	@Override
	public Page<LiveDto> findAll(Pageable pageable) {
		return live.findAll(pageable);
	}

	@Override
	public <S extends LiveDto> S save(S entity) {
		return live.save(entity);
	}

	@Override
	public Optional<LiveDto> findById(Integer id) {
		return live.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return live.existsById(id);
	}

	@Override
	public long count() {
		return live.count();
	}

	@Override
	public void deleteById(Integer id) {
		live.deleteById(id);
	}

	@Override
	public void delete(LiveDto entity) {
		live.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends LiveDto> entities) {
		live.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		live.deleteAll();
	}

	@Override
	public <S extends LiveDto> Optional<S> findOne(Example<S> example) {
		return live.findOne(example);
	}

	@Override
	public <S extends LiveDto> Page<S> findAll(Example<S> example, Pageable pageable) {
		return live.findAll(example, pageable);
	}

	@Override
	public <S extends LiveDto> long count(Example<S> example) {
		return live.count(example);
	}

	@Override
	public <S extends LiveDto> boolean exists(Example<S> example) {
		return live.exists(example);
	}

}