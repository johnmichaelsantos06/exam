package com.exam.skutestproduct.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModifiedTime {
	@JsonProperty("$date")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
