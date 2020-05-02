package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.LiveDao;
import com.example.demo.dto.LiveDto;
import com.example.demo.frontinterface.TopEventInterface;

@Controller
public class TopController {

	// 各都道府県の番号を定義
	int TOKYO_AREA_NO = 12;
	int KANAGAWA_AREA_NO = 13;
	int AICHI_AREA_NO = 22;

	@Autowired
	private LiveDao liveDao;

	@RequestMapping("/")
	public String top(Model model) {
		// ① DB よりイベントの情報を取得する
		// ライブ情報を取得する
		List<LiveDto> liveInfoList = liveDao.findAll();

		// ② トップに出す東京、神奈川、愛知のイベント情報を保持するリストを作成する
		// 東京のライブ情報
		ArrayList<TopEventInterface> tokyoEventList = new ArrayList<>();
		// 神奈川のライブ情報
		ArrayList<TopEventInterface> kanagawaEventList = new ArrayList<>();
		// 愛知（名古屋）のライブ情報
		ArrayList<TopEventInterface> nagoyaEventList = new ArrayList<>();

		// ③ 取得したイベント情報をもとに②で作成したリストに格納
		for(LiveDto live:liveInfoList) {
			// ⑥ ②で作成したリストに追加する用の TopEventInterface のインスタンスを生成
			TopEventInterface event = new TopEventInterface();
			// ⑦ 各値を設定していく
			event.setEventUrl("http://localhost:8080/info?eventcd=" + live.getSequence());
			event.setEventName(live.getEvent_name());
			event.setInfo(live.getLive_info());
			// 日付を 月/日 のフォーマットに変換
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
			event.setEventDate(sdf.format(live.getLive_date_time()));

			if(live.getLive_area_no() == TOKYO_AREA_NO) {
				tokyoEventList.add(event);
			} else if (live.getLive_area_no() == KANAGAWA_AREA_NO) {
				kanagawaEventList.add(event);
			} else {
				nagoyaEventList.add(event);
			}
		}

		// ④ HTML（フロント）に渡す
		model.addAttribute("tokyoeventlist", tokyoEventList);
		model.addAttribute("kanagawaeventlist", kanagawaEventList);
		model.addAttribute("nagoyaeventlist", nagoyaEventList);

		// ⑤ 表示するHTML を選択
		return "top";

	}

}