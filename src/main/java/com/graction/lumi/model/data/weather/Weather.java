package com.graction.lumi.model.data.weather;

import javax.xml.bind.annotation.XmlAttribute;

public class Weather {
	private int id;
	private String message;

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlAttribute
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
