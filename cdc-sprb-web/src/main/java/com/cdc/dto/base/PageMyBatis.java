package com.cdc.dto.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

/**
 * <p>
 * PageMyBatis.
 * </p>
 */
public class PageMyBatis<E> extends ArrayList<E> {
    private static final long serialVersionUID = -3472924628671922516L;
    /**
     * data connection.
     */
    private final List<E> content = Lists.newArrayList();
    /**
     * pagination information
     */
    private final PageDto pageable;


    /**
     * Instantiates a new Page my batis.
     *
     * @param content  the content
     * @param pageable the pageable
     * @param total    the total
     */
    public PageMyBatis(Collection<? extends E> content, PageDto pageable) {
        super(content);

        this.content.addAll(content);
        this.pageable = pageable;
    }

    /**
     * Instantiates a new Page my batis.
     *
     * @param content the content
     */
    public PageMyBatis(List<E> content) {
        // fixed total is 0 throw NullPointException
        this(content, new PageDto());
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("content", content)
                .add("pageable", pageable)
                .toString();
    }

	public List<E> getContent() {
		return content;
	}

	public PageDto getPageable() {
		return pageable;
	}
	
	private  PageInfo<E> pageInfo;
	
	public PageInfo<E> getPageInfo(){
		if(pageInfo == null){
			pageInfo = new PageInfo<E>();
			pageInfo.setContent(getContent());
			pageInfo.setPageable(getPageable());
		}
		return pageInfo;
	}
	
}
