package com.example.demo.frontinterface;

public class EventInfoInterface {

	// 日程
	private String eventDate;

	// イベント名
	private String eventName;

	// 会場名
	private String liveHouseName;

	// 場所
	private String area;

	// 演奏時間
	private String play;

	// 出演条件
	private String quota;

	// 備考
	private String info;

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLiveHouseName() {
		return liveHouseName;
	}

	public void setLiveHouseName(String liveHouseName) {
		this.liveHouseName = liveHouseName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}