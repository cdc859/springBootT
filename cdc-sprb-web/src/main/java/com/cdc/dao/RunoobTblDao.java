package com.cdc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cdc.dto.RunoobTblDto;
import com.cdc.dto.base.PageMyBatis;
/**
 * 表runoob_tbl基础CRUD
 * 
 *
 */
@Repository("runoobTblDao")
public interface RunoobTblDao {

	/**
	 * 插入一条表 runoob_tbl记录
	 * @param RunoobTblDto runoobTbl
	 * @return void
	 */
	public int insertRunoobTblDto(RunoobTblDto runoobTbl);

	/**
	 * 批量插入 runoob_tbl记录
	 * @param RunoobTblDto runoobTbl
	 * @return void
	 */	
	public void batchInsertRunoobTblDto(List<RunoobTblDto> list);

	/**
	 * 使用表 runoob_tbl主键更新记录
	 * @param  RunoobTblDto runoobTbl
	 * @return 影响的记录数
	 */
	public int updateRunoobTblByPk(RunoobTblDto runoobTbl);
	
	/**
	 * 使用表 runoob_tbl主键查询一条记录
	 * @param RunoobTblDto runoobTbl
	 * @return RunoobTblDto
	 */
	public RunoobTblDto selectRunoobTblByPk(RunoobTblDto runoobTbl);
	
	/**
	 * 使用表 runoob_tbl主键删除一条记录
	 * @param RunoobTblDto runoobTbl
	 * @return RunoobTblDto runoobTbl
	 */	
	public int deleteRunoobTblByPk(RunoobTblDto runoobTbl);
	
	/**
	 * 使用表 runoob_tbl主键查询列表
	 * @param RunoobTblDto runoobTbl
	 * @return RunoobTblDto
	 */
	public List<RunoobTblDto> selectRunoobTblByDto(RunoobTblDto runoobTbl);
	
	/**
	 * 使用表 runoob_tbl主键分页查询列表
	 * @param RunoobTblDto runoobTblPageDto
	 * @return PageMyBatis<RunoobTblDto>  pageMyBatis 中会返回中条数和总记录数
	 */	
	public PageMyBatis<RunoobTblDto> selectRunoobTblByDtoPage(RunoobTblDto runoobTbl);
}