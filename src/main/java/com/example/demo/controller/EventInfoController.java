package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.LiveDao;
import com.example.demo.dto.LiveDto;

@Controller
public class EventInfoController {

	@Autowired
	private LiveDao liveDao;

	@RequestMapping("/info")
	public String info(Model model, @RequestParam("eventcd") Integer eventCd) {

		// ID を指定してイベント情報を取得する
		LiveDto event = liveDao.findById(eventCd).get();

		return "info";
	}

}