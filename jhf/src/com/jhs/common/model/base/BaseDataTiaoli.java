package com.jhs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDataTiaoli<M extends BaseDataTiaoli<M>> extends Model<M> implements IBean {

	public void setTiaoliId(java.lang.Long tiaoliId) {
		set("tiaoli_id", tiaoliId);
	}

	public java.lang.Long getTiaoliId() {
		return get("tiaoli_id");
	}

	public void setTiaoliName(java.lang.String tiaoliName) {
		set("tiaoli_name", tiaoliName);
	}

	public java.lang.String getTiaoliName() {
		return get("tiaoli_name");
	}

	public void setTiaoliContent(java.lang.String tiaoliContent) {
		set("tiaoli_content", tiaoliContent);
	}

	public java.lang.String getTiaoliContent() {
		return get("tiaoli_content");
	}

}