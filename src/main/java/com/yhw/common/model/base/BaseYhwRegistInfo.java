package com.yhw.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseYhwRegistInfo<M extends BaseYhwRegistInfo<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setCode(java.lang.String code) {
		set("code", code);
		return (M)this;
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}

	public M setOrgCode(java.lang.String orgCode) {
		set("org_code", orgCode);
		return (M)this;
	}
	
	public java.lang.String getOrgCode() {
		return getStr("org_code");
	}

	public M setProjectCode(java.lang.String projectCode) {
		set("project_code", projectCode);
		return (M)this;
	}
	
	public java.lang.String getProjectCode() {
		return getStr("project_code");
	}

	public M setProjectName(java.lang.String projectName) {
		set("project_name", projectName);
		return (M)this;
	}
	
	public java.lang.String getProjectName() {
		return getStr("project_name");
	}

	public M setPackageName(java.lang.String packageName) {
		set("package_name", packageName);
		return (M)this;
	}
	
	public java.lang.String getPackageName() {
		return getStr("package_name");
	}

	public M setRegistStarttime(java.util.Date registStarttime) {
		set("regist_starttime", registStarttime);
		return (M)this;
	}
	
	public java.util.Date getRegistStarttime() {
		return get("regist_starttime");
	}

	public M setRegistEndtime(java.util.Date registEndtime) {
		set("regist_endtime", registEndtime);
		return (M)this;
	}
	
	public java.util.Date getRegistEndtime() {
		return get("regist_endtime");
	}

	public M setBiddingEndtime(java.util.Date biddingEndtime) {
		set("bidding_endtime", biddingEndtime);
		return (M)this;
	}
	
	public java.util.Date getBiddingEndtime() {
		return get("bidding_endtime");
	}

	public M setOpenbidStarttime(java.util.Date openbidStarttime) {
		set("openbid_starttime", openbidStarttime);
		return (M)this;
	}
	
	public java.util.Date getOpenbidStarttime() {
		return get("openbid_starttime");
	}

	public M setRegistPackage(java.lang.String registPackage) {
		set("regist_package", registPackage);
		return (M)this;
	}
	
	public java.lang.String getRegistPackage() {
		return getStr("regist_package");
	}

	public M setRegistStatus(java.lang.String registStatus) {
		set("regist_status", registStatus);
		return (M)this;
	}
	
	public java.lang.String getRegistStatus() {
		return getStr("regist_status");
	}

	public M setRegistTime(java.util.Date registTime) {
		set("regist_time", registTime);
		return (M)this;
	}
	
	public java.util.Date getRegistTime() {
		return get("regist_time");
	}

	public M setProductCode(java.lang.String productCode) {
		set("product_code", productCode);
		return (M)this;
	}
	
	public java.lang.String getProductCode() {
		return getStr("product_code");
	}

	public M setBidfileName(java.lang.String bidfileName) {
		set("bidfile_name", bidfileName);
		return (M)this;
	}
	
	public java.lang.String getBidfileName() {
		return getStr("bidfile_name");
	}

	public M setPayBidbookTime(java.util.Date payBidbookTime) {
		set("pay_bidbook_time", payBidbookTime);
		return (M)this;
	}
	
	public java.util.Date getPayBidbookTime() {
		return get("pay_bidbook_time");
	}

	public M setBidbookFee(java.lang.String bidbookFee) {
		set("bidbook_fee", bidbookFee);
		return (M)this;
	}
	
	public java.lang.String getBidbookFee() {
		return getStr("bidbook_fee");
	}

	public M setPayBailTime(java.util.Date payBailTime) {
		set("pay_bail_time", payBailTime);
		return (M)this;
	}
	
	public java.util.Date getPayBailTime() {
		return get("pay_bail_time");
	}

	public M setBailFee(java.lang.String bailFee) {
		set("bail_fee", bailFee);
		return (M)this;
	}
	
	public java.lang.String getBailFee() {
		return getStr("bail_fee");
	}

	public M setHsopitalName(java.lang.String hsopitalName) {
		set("hsopital_name", hsopitalName);
		return (M)this;
	}
	
	public java.lang.String getHsopitalName() {
		return getStr("hsopital_name");
	}

	public M setHospitalUrl(java.lang.String hospitalUrl) {
		set("hospital_url", hospitalUrl);
		return (M)this;
	}
	
	public java.lang.String getHospitalUrl() {
		return getStr("hospital_url");
	}

}
