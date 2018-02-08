package com.itservicesdepot.example.springbatch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class ExampleProcessor implements ItemProcessor<Integer, String> {
	private static Logger logger = LoggerFactory.getLogger(ExampleProcessor.class);
	
	public String process(Integer item) throws Exception {
		logger.info("Processing 'Number {}'", item);
		return String.format("String of the value %d", item);
	}

}
