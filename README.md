# example-springbatch-multiple-writers

This is to demo how to use Spring-Batch with Multiple Writers based on Conditions

- This job takes a file as an input parameter. The files contains 2 columns id and name. 
- The job will write into 2 files
	- All IDs are less than the number 16 will be stored as under16.csv
	- All IDs are more than the number 16 will be stored as over16.csv 
