package com.itservicesdepot.example.springbatch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class ExampleWriter implements ItemWriter<String>{
	private static Logger logger = LoggerFactory.getLogger(ExampleWriter.class);
	
	public void write(List<? extends String> items) throws Exception {
		for (String item : items) {
			logger.info("Writing " + item);
		}
	}

}
