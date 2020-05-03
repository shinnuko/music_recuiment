package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LiveHouseDto;

@Service
public class LiveHouseDao implements LiveHouseRepository {

	@Autowired
	LiveHouseRepository liveHouseRepository;

	@Override
	public List<LiveHouseDto> findAll() {
		return liveHouseRepository.findAll();
	}

	@Override
	public List<LiveHouseDto> findAll(Sort sort) {
		return liveHouseRepository.findAll(sort);
	}

	@Override
	public List<LiveHouseDto> findAllById(Iterable<Integer> ids) {
		return liveHouseRepository.findAllById(ids);
	}

	@Override
	public <S extends LiveHouseDto> List<S> saveAll(Iterable<S> entities) {
		return liveHouseRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		liveHouseRepository.flush();
	}

	@Override
	public <S extends LiveHouseDto> S saveAndFlush(S entity) {
		return liveHouseRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<LiveHouseDto> entities) {
		liveHouseRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		liveHouseRepository.deleteAllInBatch();
	}

	@Override
	public LiveHouseDto getOne(Integer id) {
		return liveHouseRepository.getOne(id);
	}

	@Override
	public <S extends LiveHouseDto> List<S> findAll(Example<S> example) {
		return liveHouseRepository.findAll(example);
	}

	@Override
	public <S extends LiveHouseDto> List<S> findAll(Example<S> example, Sort sort) {
		return liveHouseRepository.findAll(example, sort);
	}

	@Override
	public Page<LiveHouseDto> findAll(Pageable pageable) {
		return liveHouseRepository.findAll(pageable);
	}

	@Override
	public <S extends LiveHouseDto> S save(S entity) {
		return liveHouseRepository.save(entity);
	}

	@Override
	public Optional<LiveHouseDto> findById(Integer id) {
		return liveHouseRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return liveHouseRepository.existsById(id);
	}

	@Override
	public long count() {
		return liveHouseRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		liveHouseRepository.deleteById(id);
	}

	@Override
	public void delete(LiveHouseDto entity) {
		liveHouseRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends LiveHouseDto> entities) {
		liveHouseRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		liveHouseRepository.deleteAll();
	}

	@Override
	public <S extends LiveHouseDto> Optional<S> findOne(Example<S> example) {
		return liveHouseRepository.findOne(example);
	}

	@Override
	public <S extends LiveHouseDto> Page<S> findAll(Example<S> example, Pageable pageable) {
		return liveHouseRepository.findAll(example, pageable);
	}

	@Override
	public <S extends LiveHouseDto> long count(Example<S> example) {
		return liveHouseRepository.count(example);
	}

	@Override
	public <S extends LiveHouseDto> boolean exists(Example<S> example) {
		return liveHouseRepository.exists(example);
	}

}

