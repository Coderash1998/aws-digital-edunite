package com.hackdfw.smsbackend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {
	@JsonProperty("lat")
	private String lat;
	
	@JsonProperty("lng")
	private String lng;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Properties [lat=" + lat + ", lng=" + lng + "]";
	}
	
	
}
