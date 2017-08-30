package com.cdc.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestExecutor {
	
	private Logger loger = LoggerFactory.getLogger(this.getClass());

	private ExecutorService executor = Executors.newSingleThreadExecutor();

	private BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>();
	 
 	@PostConstruct
    public void init() {
 		
        executor.submit(new Runnable() {
        	
            public void run() {
                executor();
            }

        });
        
    }

 	/**
 	 * 出队列
 	 */
    private void executor() {
    	
        while (true) {
        	
            try {
            	
                loger.info("TestExecutor start blockingQueue.size()=" + blockingQueue.size());//可以对此size大小进行监控，防止异常
                String busString = blockingQueue.take();
                doBus(busString);
                
            } catch (Throwable e) {
                loger.error("TestExecutor executor exception :", e);
            }
            
        }
        
    }

    /**
     * 业务处理
     * @param busString
     */
    private void doBus(String busString) {
    	
		//具体业务处理
    	System.out.println("busString :" + busString);
		
	}

	/**
     * 入队列
     */
    public void pushDate(String busString) {

        blockingQueue.offer(busString);
        
    }

}
