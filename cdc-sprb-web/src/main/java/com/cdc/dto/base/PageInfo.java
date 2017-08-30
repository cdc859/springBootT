package com.cdc.dto.base;

import java.io.Serializable;
import java.util.List;

public class PageInfo<E> implements Serializable {

	private static final long serialVersionUID = -7457822353324524388L;

	/**
	 * data connection.
	 */
	private List<E> content;
	/**
	 * pagination information
	 */
	private PageDto pageable;

	public List<E> getContent() {
		return content;
	}

	public void setContent(List<E> content) {
		this.content = content;
	}

	public PageDto getPageable() {
		return pageable;
	}

	public void setPageable(PageDto pageable) {
		this.pageable = pageable;
	}
	

}
