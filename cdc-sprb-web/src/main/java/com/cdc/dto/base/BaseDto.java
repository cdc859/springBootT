package com.cdc.dto.base;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@SuppressWarnings("serial")
public class BaseDto implements Serializable {

	/**
	 * CREATE_TM
	 */
	protected Date createTm;
	/**
	 * CREATE_EMP
	 */
	protected String createEmp;
	
	/**
	 * UPDATE_EMP
	 */
	protected String updateEmp;
	
	/**
	 * UPDATE_TM
	 */
	protected Date updateTm;
	
	protected String orderClause;//排序字段

	/**
	 * 报表标识 不同的报表标识调用不同的报表处理类
	 * ReportConfigEnum.code
	 */
	private String reportCode;

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public Date getCreateTm() {
		return createTm;
	}

	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}

	public String getCreateEmp() {
		return createEmp;
	}

	public void setCreateEmp(String createEmp) {
		this.createEmp = createEmp;
	}

	public String getUpdateEmp() {
		return updateEmp;
	}

	public void setUpdateEmp(String updateEmp) {
		this.updateEmp = updateEmp;
	}

	public Date getUpdateTm() {
		return updateTm;
	}

	public void setUpdateTm(Date updateTm) {
		this.updateTm = updateTm;
	}

	public String getOrderClause() {
		return orderClause;
	}

	public void setOrderClause(String orderClause) {
		this.orderClause = orderClause;
	}
	
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this);	
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof PageDto)) {
			return false;
		}
		PageDto rhs = (PageDto) object;
		return EqualsBuilder.reflectionEquals(this,rhs);	
	}
	
}
