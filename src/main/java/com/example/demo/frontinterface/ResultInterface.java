package com.example.demo.frontinterface;

public class ResultInterface {

	// エリア名
	private String areaName;

	// ライブハウス名
	private String liveHouseName;

	// ライブ日
	private String liveDate;

	// 詳細
	private String info;

	// 詳細ページURL
	private String href;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getLiveHouseName() {
		return liveHouseName;
	}

	public void setLiveHouseName(String liveHouseName) {
		this.liveHouseName = liveHouseName;
	}

	public String getLiveDate() {
		return liveDate;
	}

	public void setLiveDate(String liveDate) {
		this.liveDate = liveDate;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
