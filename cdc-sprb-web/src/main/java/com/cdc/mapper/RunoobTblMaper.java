package com.cdc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cdc.dto.RunoobTblDto;

@Mapper
public interface RunoobTblMaper {
	
	@Select("select runoob_id as runoobId, runoob_title as runoobTitle, runoob_author as runoobAuthor, submission_date as submissionDate from runoob_tbl where runoob_author = #{ra}")
	List<RunoobTblDto> Select(String ra);
}
