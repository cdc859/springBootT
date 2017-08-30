package com.cdc.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 个性化日志
 *
 */
public class IndividuationInfoLog {

	private static Logger logger = LoggerFactory.getLogger(IndividuationInfoLog.class);
	
	public static void addLog(String errorMsg) {
		logger.info(errorMsg);
	}
}
