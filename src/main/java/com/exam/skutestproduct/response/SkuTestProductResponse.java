package com.exam.skutestproduct.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SkuTestProductResponse {
	private Id id;
	@JsonProperty("_class")
	private String className;
	private String additionalImages;
	private String catalogClass;
	private String catalogName;
	private String catalogVersion;
	private String categoryName;
	private List<String> categoryPath;
	private List<ClassificationAttributeList> classificationAttributeList;
	private List<String> classificationClasses;
	private String code;
	private boolean createdFromER;
	private boolean createdViaSKULibrary;
	private SkuTime creationtime;
	private boolean dueDateRequiresEval;
	private String ean;
	private boolean eligible;
	private String frontImages;
	private boolean hasExportErrors;
	private boolean hasImportErrors;
	private SkuTime imageChangeTime;
	private List<Image> images;
	private boolean imagesCheckedOut;
	private boolean isSupplierContentAvailable;
	private boolean isSupplierImagesAvailable;
	private SkuTime lastEditedTime;
	private String lastEditedUser;
	private String medalStatus;
	private SkuTime modifiedtime;
	private String name;
	private SkuTime offlineDate;
	private SkuTime onlineDate;
	private String pk;
	private boolean printReady;
	private SkuTime productChangeTime;
	private String productContentQuality;
	private String rejectedReasonAddedBy;
	private SkuTime rejectedReasonModifiedTime;
	private String shortCode;
	private String statusCode;
	private String supercategories;
	private String supplierCode2;
	private String totalImages;
	private boolean updateChangeTime;
	private boolean urgent;
	private String wfCopyStatus;
	private String wfEnrichStatus;
	private String wfImageStatus;
	private String wfMediaStatus;
	private String wfQAStatus;
	private String wfSampleStatus;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Id getId() {
		return id;
	}

	public String getAdditionalImages() {
		return additionalImages;
	}

	public String getCatalogClass() {
		return catalogClass;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public String getCatalogVersion() {
		return catalogVersion;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public List<String> getCategoryPath() {
		return categoryPath;
	}

	public List<ClassificationAttributeList> getClassificationAttributeList() {
		return classificationAttributeList;
	}

	public List<String> getClassificationClasses() {
		return classificationClasses;
	}

	public String getCode() {
		return code;
	}

	public boolean isCreatedFromER() {
		return createdFromER;
	}

	public boolean isCreatedViaSKULibrary() {
		return createdViaSKULibrary;
	}

	public SkuTime getCreationtime() {
		return creationtime;
	}

	public boolean isDueDateRequiresEval() {
		return dueDateRequiresEval;
	}

	public String getEan() {
		return ean;
	}

	public boolean isEligible() {
		return eligible;
	}

	public String getFrontImages() {
		return frontImages;
	}

	public boolean isHasExportErrors() {
		return hasExportErrors;
	}

	public boolean isHasImportErrors() {
		return hasImportErrors;
	}

	public SkuTime getImageChangeTime() {
		return imageChangeTime;
	}

	public List<Image> getImages() {
		return images;
	}

	public boolean isImagesCheckedOut() {
		return imagesCheckedOut;
	}

	public boolean isSupplierContentAvailable() {
		return isSupplierContentAvailable;
	}

	public boolean isSupplierImagesAvailable() {
		return isSupplierImagesAvailable;
	}

	public SkuTime getLastEditedTime() {
		return lastEditedTime;
	}

	public String getLastEditedUser() {
		return lastEditedUser;
	}

	public String getMedalStatus() {
		return medalStatus;
	}

	public SkuTime getModifiedtime() {
		return modifiedtime;
	}

	public String getName() {
		return name;
	}

	public SkuTime getOfflineDate() {
		return offlineDate;
	}

	public SkuTime getOnlineDate() {
		return onlineDate;
	}

	public String getPk() {
		return pk;
	}

	public boolean isPrintReady() {
		return printReady;
	}

	public SkuTime getProductChangeTime() {
		return productChangeTime;
	}

	public String getProductContentQuality() {
		return productContentQuality;
	}

	public String getRejectedReasonAddedBy() {
		return rejectedReasonAddedBy;
	}

	public SkuTime getRejectedReasonModifiedTime() {
		return rejectedReasonModifiedTime;
	}

	public String getShortCode() {
		return shortCode;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getSupercategories() {
		return supercategories;
	}

	public String getSupplierCode2() {
		return supplierCode2;
	}

	public String getTotalImages() {
		return totalImages;
	}

	public boolean isUpdateChangeTime() {
		return updateChangeTime;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public String getWfCopyStatus() {
		return wfCopyStatus;
	}

	public String getWfEnrichStatus() {
		return wfEnrichStatus;
	}

	public String getWfImageStatus() {
		return wfImageStatus;
	}

	public String getWfMediaStatus() {
		return wfMediaStatus;
	}

	public String getWfQAStatus() {
		return wfQAStatus;
	}

	public String getWfSampleStatus() {
		return wfSampleStatus;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public void setAdditionalImages(String additionalImages) {
		this.additionalImages = additionalImages;
	}

	public void setCatalogClass(String catalogClass) {
		this.catalogClass = catalogClass;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public void setCatalogVersion(String catalogVersion) {
		this.catalogVersion = catalogVersion;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setCategoryPath(List<String> categoryPath) {
		this.categoryPath = categoryPath;
	}

	public void setClassificationAttributeList(List<ClassificationAttributeList> classificationAttributeList) {
		this.classificationAttributeList = classificationAttributeList;
	}

	public void setClassificationClasses(List<String> classificationClasses) {
		this.classificationClasses = classificationClasses;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCreatedFromER(boolean createdFromER) {
		this.createdFromER = createdFromER;
	}

	public void setCreatedViaSKULibrary(boolean createdViaSKULibrary) {
		this.createdViaSKULibrary = createdViaSKULibrary;
	}

	public void setCreationtime(CreationTime creationtime) {
		this.creationtime = creationtime;
	}

	public void setDueDateRequiresEval(boolean dueDateRequiresEval) {
		this.dueDateRequiresEval = dueDateRequiresEval;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	public void setFrontImages(String frontImages) {
		this.frontImages = frontImages;
	}

	public void setHasExportErrors(boolean hasExportErrors) {
		this.hasExportErrors = hasExportErrors;
	}

	public void setHasImportErrors(boolean hasImportErrors) {
		this.hasImportErrors = hasImportErrors;
	}

	public void setImageChangeTime(SkuTime imageChangeTime) {
		this.imageChangeTime = imageChangeTime;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public void setImagesCheckedOut(boolean imagesCheckedOut) {
		this.imagesCheckedOut = imagesCheckedOut;
	}

	public void setSupplierContentAvailable(boolean isSupplierContentAvailable) {
		this.isSupplierContentAvailable = isSupplierContentAvailable;
	}

	public void setSupplierImagesAvailable(boolean isSupplierImagesAvailable) {
		this.isSupplierImagesAvailable = isSupplierImagesAvailable;
	}

	public void setLastEditedTime(SkuTime lastEditedTime) {
		this.lastEditedTime = lastEditedTime;
	}

	public void setLastEditedUser(String lastEditedUser) {
		this.lastEditedUser = lastEditedUser;
	}

	public void setMedalStatus(String medalStatus) {
		this.medalStatus = medalStatus;
	}

	public void setModifiedtime(SkuTime modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfflineDate(SkuTime offlineDate) {
		this.offlineDate = offlineDate;
	}

	public void setOnlineDate(SkuTime onlineDate) {
		this.onlineDate = onlineDate;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public void setPrintReady(boolean printReady) {
		this.printReady = printReady;
	}

	public void setProductChangeTime(SkuTime productChangeTime) {
		this.productChangeTime = productChangeTime;
	}

	public void setProductContentQuality(String productContentQuality) {
		this.productContentQuality = productContentQuality;
	}

	public void setRejectedReasonAddedBy(String rejectedReasonAddedBy) {
		this.rejectedReasonAddedBy = rejectedReasonAddedBy;
	}

	public void setRejectedReasonModifiedTime(SkuTime rejectedReasonModifiedTime) {
		this.rejectedReasonModifiedTime = rejectedReasonModifiedTime;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public void setSupercategories(String supercategories) {
		this.supercategories = supercategories;
	}

	public void setSupplierCode2(String supplierCode2) {
		this.supplierCode2 = supplierCode2;
	}

	public void setTotalImages(String totalImages) {
		this.totalImages = totalImages;
	}

	public void setUpdateChangeTime(boolean updateChangeTime) {
		this.updateChangeTime = updateChangeTime;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public void setWfCopyStatus(String wfCopyStatus) {
		this.wfCopyStatus = wfCopyStatus;
	}

	public void setWfEnrichStatus(String wfEnrichStatus) {
		this.wfEnrichStatus = wfEnrichStatus;
	}

	public void setWfImageStatus(String wfImageStatus) {
		this.wfImageStatus = wfImageStatus;
	}

	public void setWfMediaStatus(String wfMediaStatus) {
		this.wfMediaStatus = wfMediaStatus;
	}

	public void setWfQAStatus(String wfQAStatus) {
		this.wfQAStatus = wfQAStatus;
	}

	public void setWfSampleStatus(String wfSampleStatus) {
		this.wfSampleStatus = wfSampleStatus;
	}
}
