package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UrlList {

	@Override
	public String toString() {
		return "UrlList [id=" + id + ", url=" + url + "]";
	}
	@Id
	int id;
	String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
