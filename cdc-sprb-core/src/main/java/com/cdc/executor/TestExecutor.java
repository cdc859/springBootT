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
 	 * ������
 	 */
    private void executor() {
    	
        while (true) {
        	
            try {
            	
                loger.info("TestExecutor start blockingQueue.size()=" + blockingQueue.size());//���ԶԴ�size��С���м�أ���ֹ�쳣
                String busString = blockingQueue.take();
                doBus(busString);
                
            } catch (Throwable e) {
                loger.error("TestExecutor executor exception :", e);
            }
            
        }
        
    }

    /**
     * ҵ����
     * @param busString
     */
    private void doBus(String busString) {
    	
		//����ҵ����
    	System.out.println("busString :" + busString);
		
	}

	/**
     * �����
     */
    public void pushDate(String busString) {

        blockingQueue.offer(busString);
        
    }

}
