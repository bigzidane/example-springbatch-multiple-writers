# example-springbatch-partitioner

This is to demo how to use Spring-Batch with

Partitioner
Reader
Writer
Processor
In this example, we will create X number of threads and then each of them go through Reader and then Processor and then Writer.

The Reader is simply getting a parameter from Partitioner as a number
The Processor is simply converting a number from Reader to a string
The Writer is simply printing out the String from Processor
