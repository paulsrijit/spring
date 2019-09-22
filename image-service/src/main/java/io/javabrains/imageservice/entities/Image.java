package io.javabrains.imageservice.entities;

public class Image {
	private int id;
	private String title;
	private String url;

	public Image(int id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

}
