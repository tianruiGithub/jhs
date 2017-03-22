package com.jhs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDataPhysique<M extends BaseDataPhysique<M>> extends Model<M> implements IBean {

	public void setPhysiqueId(java.lang.Long physiqueId) {
		set("physique_id", physiqueId);
	}

	public java.lang.Long getPhysiqueId() {
		return get("physique_id");
	}

	public void setDemandNo(java.lang.String demandNo) {
		set("demand_no", demandNo);
	}

	public java.lang.String getDemandNo() {
		return get("demand_no");
	}

	public void setPhysiqueNo(java.lang.String physiqueNo) {
		set("physique_no", physiqueNo);
	}

	public java.lang.String getPhysiqueNo() {
		return get("physique_no");
	}

	public void setPhysiqueName(java.lang.String physiqueName) {
		set("physique_name", physiqueName);
	}

	public java.lang.String getPhysiqueName() {
		return get("physique_name");
	}

	public void setPhysiqueGuanlian(java.lang.String physiqueGuanlian) {
		set("physique_guanlian", physiqueGuanlian);
	}

	public java.lang.String getPhysiqueGuanlian() {
		return get("physique_guanlian");
	}

	public void setPhysiqueIntroduce(java.lang.String physiqueIntroduce) {
		set("physique_introduce", physiqueIntroduce);
	}

	public java.lang.String getPhysiqueIntroduce() {
		return get("physique_introduce");
	}

}