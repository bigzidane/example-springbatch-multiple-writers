package com.itservicesdepot.example.springbatch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class ExampleReader implements ItemReader<Integer>{

	private Boolean read = false;
	private Integer value;
	
	public Integer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if (!read) {
			read = true;
			return value;
		} else {
			return null;
		}
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
