package com.cdc.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {
	
	protected static Logger logger = LoggerFactory.getLogger(RedisController.class);  
    
    @Autowired  
    StringRedisTemplate stringRedisTemplate;  
      
    @Resource(name="stringRedisTemplate")  
    ValueOperations<String,String> valOpsStr;  
    
    @Resource(name="redisTemplate")
    private RedisTemplate<String, Object> redisTemplate;  
    
    
      
    @RequestMapping("set")  
    @ResponseBody
    public String setKeyAndValue(String key,String value) {  
        logger.debug("访问set:key={},value={}",key,value);  
        valOpsStr.set(key, value);  
        return "Set Ok";  
    }  
      
    @RequestMapping("get")  
    @ResponseBody
    public String getKey(String key) {  
        logger.debug("访问get:key={}",key);  
        return valOpsStr.get(key);  
    }  
    
    @RequestMapping("putList")  
    @ResponseBody
    public Long putList(String key) {  
        logger.debug("访问putList:key={}",key);  
       Long res = redisTemplate.opsForList().leftPush("sprbRedisList", key);  
        return res;
    }
    
    @RequestMapping("getList")  
    @ResponseBody
    public String getList(String key) {  
        logger.debug("访问getList:key={}",key);  
        String v = (String) redisTemplate.opsForList().rightPop("sprbRedisList");  
        logger.debug("v:" + v);
        return v;
    }

}
