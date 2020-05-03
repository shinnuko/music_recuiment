package com.example.demo.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.LiveDao;
import com.example.demo.dao.LiveHouseDao;
import com.example.demo.dto.LiveDto;
import com.example.demo.dto.LiveHouseDto;

@Controller
public class EventInfoController {

	@Autowired
	private LiveDao liveDao;

	@Autowired
	private LiveHouseDao liveHouseDao;

	@RequestMapping("/info")
	public String info(Model model, @RequestParam("eventcd") Integer eventCd) {

		// ID を指定してイベント情報を取得する
		LiveDto event = liveDao.findById(eventCd).get();

		// 日付を 月/日 のフォーマットに変換
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String eventDate = sdf.format(event.getLive_date_time());

		// ライブハウス名を取得する（m_live の live_house_no と m_live_house の id を突合させる）
		LiveHouseDto liveHouse = liveHouseDao.findById(event.getLive_house_no()).get();

		//  フロントに値を渡していく
		model.addAttribute("imgSrc", event.getImage_src());
		model.addAttribute("liveDate", eventDate);
		model.addAttribute("liveName",event.getEvent_name());
		model.addAttribute("liveHouseName", liveHouse.getLive_house_name());
		model.addAttribute("liveArea", liveHouse.getLive_house_area());
		model.addAttribute("play", event.getPlay());
		model.addAttribute("quota", event.getQuota());
		model.addAttribute("liveInfo", event.getLive_info());

		return "info";
	}

}
	