package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_live_house")
public class LiveHouseDto {

	// シーケンス
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column
	private int live_house_no;

	// ライブハウス名
	@Column
	private String live_house_name;

	// ライブハウス都道府県番号
	@Column
	private int live_house_prefecture_no;

	// ライブハウスエリア名
	@Column
	private String live_house_area;

	// ライブハウスエリア番号
	@Column
	private int live_house_area_no;

	public int getLive_house_no() {
		return live_house_no;
	}

	public void setLive_house_no(int live_house_no) {
		this.live_house_no = live_house_no;
	}

	public String getLive_house_name() {
		return live_house_name;
	}

	public void setLive_house_name(String live_house_name) {
		this.live_house_name = live_house_name;
	}

	public int getLive_house_prefecture_no() {
		return live_house_prefecture_no;
	}

	public void setLive_house_prefecture_no(int live_house_prefecture_no) {
		this.live_house_prefecture_no = live_house_prefecture_no;
	}

	public String getLive_house_area() {
		return live_house_area;
	}

	public void setLive_house_area(String live_house_area) {
		this.live_house_area = live_house_area;
	}

	public int getLive_house_area_no() {
		return live_house_area_no;
	}

	public void setLive_house_area_no(int live_house_area_no) {
		this.live_house_area_no = live_house_area_no;
	}

}