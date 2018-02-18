package com.itservicesdepot.example.springbatch.writer;

import org.springframework.batch.support.annotation.Classifier;

import com.itservicesdepot.example.springbatch.model.SoccerPlayerEntry;

public class ExampleWriterRouteImpl {

	@Classifier
    public String classify(SoccerPlayerEntry soccerPlayerEntry) {
        String type =  soccerPlayerEntry.getId() < 16 ? "under16" : "over16";
        return type;
    }

}
