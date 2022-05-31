package com.exam.skutestproduct.response;

public class ClassificationAttributeList {
	private String fullQualifier;
	private String classificationClass;
	private String qualifier;
	private String name;
	private String value;

	public String getFullQualifier() {
		return fullQualifier;
	}

	public String getClassificationClass() {
		return classificationClass;
	}

	public String getQualifier() {
		return qualifier;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void setFullQualifier(String fullQualifier) {
		this.fullQualifier = fullQualifier;
	}

	public void setClassificationClass(String classificationClass) {
		this.classificationClass = classificationClass;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
