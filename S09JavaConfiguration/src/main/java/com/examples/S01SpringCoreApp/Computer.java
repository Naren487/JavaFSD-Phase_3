package com.examples.S01SpringCoreApp;

public class Computer {
	int cpucores;
	String memorySize;
	String storageSize;
	public Computer(int cpucores, String memorySize, String storageSize) {
		super();
		this.cpucores = cpucores;
		this.memorySize = memorySize;
		this.storageSize = storageSize;
	}
	@Override
	public String toString() {
		return "Computer [cpucores=" + cpucores + ", memorySize=" + memorySize + ", storageSize=" + storageSize + "]";
	}
	
	
}
