package com.itservicesdepot.example.springbatch.partitioner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class ExamplePartitioner implements Partitioner {
	private Integer initValue;

	public Map<String, ExecutionContext> partition(int arg0) {
		Map<String, ExecutionContext> queue = new HashMap<String, ExecutionContext>();

		for (int i=1; i<=6; i++) {
			ExecutionContext ec = new ExecutionContext();
			ec.put("valueForReader", this.initValue + i);

			queue.put("Partition_Item"+i, ec);
		}

		return queue;
	}

	public void setInitValue(Integer initValue) {
		this.initValue = initValue;
	}
	
}
