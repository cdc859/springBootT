package com.cdc.dto;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.cdc.dto.base.BaseDto;
import com.cdc.dto.base.PageDto;
import com.cdc.dto.base.Paginationable;

public class RunoobTblDto extends BaseDto implements Paginationable{

	private static final long serialVersionUID = 1L;
	
	private PageDto page = new PageDto();

	/**
	*  runoob_id
	*/
	private Integer runoobId;
	/**
	*  runoob_title
	*/
	private String runoobTitle;
	/**
	*  runoob_author
	*/
	private String runoobAuthor;
	/**
	*  submission_date
	*/
	private Date submissionDate;

	public void setRunoobId(Integer runoobId){
		this.runoobId=runoobId;
	}
	
	public Integer getRunoobId(){
		return this.runoobId;
	}
	public void setRunoobTitle(String runoobTitle){
		this.runoobTitle=runoobTitle;
	}
	
	public String getRunoobTitle(){
		return this.runoobTitle;
	}
	public void setRunoobAuthor(String runoobAuthor){
		this.runoobAuthor=runoobAuthor;
	}
	
	public String getRunoobAuthor(){
		return this.runoobAuthor;
	}
	public void setSubmissionDate(Date submissionDate){
		this.submissionDate=submissionDate;
	}
	
	public Date getSubmissionDate(){
		return this.submissionDate;
	}


	public PageDto getPage() {
		return page;
	}

	public void setPage(PageDto page) {
		this.page = page;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
   	}
   
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this);	
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof RunoobTblDto)) {
			return false;
		}
		RunoobTblDto rhs = (RunoobTblDto) object;
		return EqualsBuilder.reflectionEquals(this,rhs);	
	}
}