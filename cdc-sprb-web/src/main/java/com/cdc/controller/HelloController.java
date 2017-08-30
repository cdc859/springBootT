package com.cdc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdc.executor.TestExecutor;
import com.cdc.logs.IndividuationInfoLog;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	protected static Logger logger = LoggerFactory.getLogger(HelloController.class); 
	
	@Autowired
	private TestExecutor testExecutor;
	
    @RequestMapping
    @ResponseBody
    public String hello() {
    	IndividuationInfoLog.addLog("访问hello()方法");
    	testExecutor.pushDate("测试excutor方法");
        return "Hello Spring-Boot";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
    	
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = null;
        
        for (int i = 1; i <= 5; i++) {
        	
            map = new HashMap<String, String>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
            
        }
        
        return list;
    }
    
    @RequestMapping("/your/{name}")  
    public String hellName(@PathVariable String name) {
    	
    	logger.info("访问 hellName() 参数 Name={}"+name);
    	
        return "your is "+name;  
    } 

}
