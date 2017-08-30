package com.cdc.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdc.dao.RunoobTblDao;
import com.cdc.dto.RunoobTblDto;
import com.cdc.mapper.RunoobTblMaper;
import com.github.pagehelper.PageHelper;


@Controller
@RequestMapping("/mydb")
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private RunoobTblDao runoobTblDao;
    
    @Autowired
	private RunoobTblMaper runoobTblMaper;
    
    protected static Logger logger = LoggerFactory.getLogger(DbController.class); 
    
    @RequestMapping("/getUsers")
    @ResponseBody
    public List<Map<String, Object>> getDbType() {
    	
        String sql = "select * from runoob_tbl";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        
        for (Map<String, Object> map : list) {
        	
            Set<Entry<String, Object>> entries = map.entrySet();
            
            if(entries != null) {
                	
                Iterator<Entry<String, Object>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                	
	                Entry<String, Object> entry = (Entry<String, Object>) iterator.next();
	                Object key = entry.getKey();
	                Object value = entry.getValue();
	                
	                System.out.println(key+":"+value);
                    
                }
                    
            }
                
        }
        
        return list;
        
    }
    
    @RequestMapping("/user/{id}")
    @ResponseBody
    public Map<String,Object> getUser(@PathVariable String id) {
    	
        Map<String,Object> map = null;
        List<Map<String, Object>> list = getDbType();
        
        for (Map<String, Object> dbmap : list) {
            
            Set<String> set = dbmap.keySet();
            
            for (String key : set) {
            	
                if (key.equals("runoob_id")) {
                	
                	String keyValue = String.valueOf(dbmap.get(key));
                	
                    if (keyValue.equals(id)) {
                        map = dbmap;
                    }
                    
                }
                
            }
            
        }
        
        if (map == null) {
        	map = list.get(0);
        }
            
        return map;
        
    }
    
    @RequestMapping("/getRunoobTbl")
    @ResponseBody
    public List<RunoobTblDto> getRunoobTblData() {
    	
    	RunoobTblDto runoobTbl = new RunoobTblDto();
    	
    	//runoobTbl.getPage().setPageSize(10);
    	//runoobTbl.getPage().setPageNo(1);
    	PageHelper.startPage(1,2);
    	List<RunoobTblDto> runoobTblDtos =  runoobTblDao.selectRunoobTblByDto(runoobTbl);
    	
    	return runoobTblDtos;
    	
    }
    
    @RequestMapping("/saveRunoobTbl")
    @ResponseBody
    public Integer saveRunoobTblData() {
    	
    	RunoobTblDto runoobTbl = new RunoobTblDto();
    	
    	runoobTbl.setRunoobId(1000);
    	runoobTbl.setRunoobAuthor("author");
    	runoobTbl.setRunoobTitle("title");
    	runoobTbl.setSubmissionDate(new Date());
    	
    	int res = runoobTblDao.insertRunoobTblDto(runoobTbl);
    	
    	return res;
    	
    }
    
    @RequestMapping("/page")
    @ResponseBody
	public List<RunoobTblDto> selectAge(String ra) {
		/*
		 * 第一个参数是第几页；第二个参数是每页显示条数。
		 */
		PageHelper.startPage(1,2);
		return runoobTblMaper.Select(ra);
	}
    
}