package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.LiveDao;
import com.example.demo.dao.LiveHouseDao;
import com.example.demo.dto.LiveDto;
import com.example.demo.dto.LiveHouseDto;
import com.example.demo.frontinterface.ResultInterface;

@Controller
public class SearchResultController {

	@Autowired
	LiveDao liveDao;

	@Autowired
	LiveHouseDao liveHouseDao;

	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String result(Model model, @RequestParam("area_no") int areaNo, @RequestParam("date") String date) {

		// m_live から条件に合うライブを取得する
		String monthStart = date + "-01 00:00:00";
		String monthEnd = date + "-31 23:59:59";
		List<LiveDto> targetLiveList = liveDao.findSearchEvent(monthStart, monthEnd, areaNo);

		// フロント返却用
		ArrayList<ResultInterface> liveList = new ArrayList<>();

		for(LiveDto live : targetLiveList) {
			ResultInterface t = new ResultInterface();
			// 詳細情報
			t.setInfo(live.getLive_info());
			// ライブ日
			SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
			String eventDate = sdf.format(live.getLive_date_time());
			t.setLiveDate(eventDate);
			// ライブハウス情報
			LiveHouseDto liveHouse = liveHouseDao.findById(live.getLive_house_no()).get();
			// エリア名
			t.setAreaName(liveHouse.getLive_house_area());
			// ライブハウス名
			t.setLiveHouseName(liveHouse.getLive_house_name());
			// 詳細 URL
			t.setHref("http://localhost:8080/info?eventcd="+live.getSequence());
			// リストに追加
			liveList.add(t);
		}

		model.addAttribute("liveList", liveList);

		return "result";
	}

}