package com.exam.skutestproduct.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id {
	@JsonProperty("$oid")
	private String oid;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
}
