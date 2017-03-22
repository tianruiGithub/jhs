package com.jhs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecordUser<M extends BaseRecordUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}

	public void setUserNickname(java.lang.String userNickname) {
		set("user_nickname", userNickname);
	}

	public java.lang.String getUserNickname() {
		return get("user_nickname");
	}

	public void setUserSex(java.lang.String userSex) {
		set("user_sex", userSex);
	}

	public java.lang.String getUserSex() {
		return get("user_sex");
	}

	public void setUserCountry(java.lang.String userCountry) {
		set("user_country", userCountry);
	}

	public java.lang.String getUserCountry() {
		return get("user_country");
	}

	public void setUserProvince(java.lang.String userProvince) {
		set("user_province", userProvince);
	}

	public java.lang.String getUserProvince() {
		return get("user_province");
	}

	public void setUserCity(java.lang.String userCity) {
		set("user_city", userCity);
	}

	public java.lang.String getUserCity() {
		return get("user_city");
	}

	public void setUserHead(java.lang.String userHead) {
		set("user_head", userHead);
	}

	public java.lang.String getUserHead() {
		return get("user_head");
	}

	public void setUserSubscribeTime(java.util.Date userSubscribeTime) {
		set("user_subscribe_time", userSubscribeTime);
	}

	public java.util.Date getUserSubscribeTime() {
		return get("user_subscribe_time");
	}

}
