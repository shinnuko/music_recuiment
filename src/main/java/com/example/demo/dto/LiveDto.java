package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_live")
public class LiveDto {

	// シーケンス
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column
	private int sequence;

	// ライブハウス番号
	@Column
	private int live_house_no;

	// ライブ地域番号
	@Column
	private int live_area_no;

	// ライブ情報
	@Column
	private String live_info;

	// ライブURL
	@Column
	private String href_url;

	// ライブ日時
	@Column
	private Date live_date_time;

	// 区切り文字
	@Column
	private String quota;

	// 演奏時間
	@Column
	private String play;

	// イベント画像URL
	@Column
	private String image_src;

	// 表示フラグ
	@Column
	private boolean disp_flg;

	// イベント名
	@Column
	private String event_name;

	// ジャンル名
	@Column
	private String genre;

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getLive_house_no() {
		return live_house_no;
	}

	public void setLive_house_no(int live_house_no) {
		this.live_house_no = live_house_no;
	}

	public int getLive_area_no() {
		return live_area_no;
	}

	public void setLive_area_no(int live_area_no) {
		this.live_area_no = live_area_no;
	}

	public String getLive_info() {
		return live_info;
	}

	public void setLive_info(String live_info) {
		this.live_info = live_info;
	}

	public String getHref_url() {
		return href_url;
	}

	public void setHref_url(String href_url) {
		this.href_url = href_url;
	}

	public Date getLive_date_time() {
		return live_date_time;
	}

	public void setLive_date_time(Date live_date_time) {
		this.live_date_time = live_date_time;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}

	public String getImage_src() {
		return image_src;
	}

	public void setImage_src(String image_src) {
		this.image_src = image_src;
	}

	public boolean isDisp_flg() {
		return disp_flg;
	}

	public void setDisp_flg(boolean disp_flg) {
		this.disp_flg = disp_flg;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
