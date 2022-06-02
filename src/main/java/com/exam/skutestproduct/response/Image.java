package com.exam.skutestproduct.response;

public class Image {
	private int index;
	private boolean clippingPath;
	private SkuTime modifiedTime;
	private String format;
	private String resolution;
	private String url;

	public int getIndex() {
		return index;
	}

	public boolean isClippingPath() {
		return clippingPath;
	}

	public SkuTime getModifiedTime() {
		return modifiedTime;
	}

	public String getFormat() {
		return format;
	}

	public String getResolution() {
		return resolution;
	}

	public String getUrl() {
		return url;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setClippingPath(boolean clippingPath) {
		this.clippingPath = clippingPath;
	}

	public void setModifiedTime(SkuTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
