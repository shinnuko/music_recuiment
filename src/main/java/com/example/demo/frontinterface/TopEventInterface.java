package com.example.demo.frontinterface;

public class TopEventInterface {
	    
	    // イベント詳細URL
		private String eventUrl;

		// 日付表示
		private String eventDate;

		// イベント名
		private String eventName;

		// 文言
		private String info;

		public String getEventUrl() {
			return eventUrl;
		}

		public void setEventUrl(String eventUrl) {
			this.eventUrl = eventUrl;
		}

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

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

}
