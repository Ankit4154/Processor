package com.crypto.computers.entities;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Processor {

	private String name;
	private int cores;
	private int threads;
	private double maxFrequency;
	private String socket;
	private String modelNumber;
	private String manufacturer;
	private String imageUrl;
	
	// no arg constructor
	public Processor() {}
	
	// getters and setters
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public int getThreads() {
		return threads;
	}
	public void setThreads(int threads) {
		this.threads = threads;
	}
	public double getMaxFrequency() {
		return maxFrequency;
	}
	public void setMaxFrequency(double maxFrequency) {
		this.maxFrequency = maxFrequency;
	}
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Processor [name=" + name + ", cores=" + cores + ", threads=" + threads + ", maxFrequency="
				+ maxFrequency + ", socket=" + socket + ", modelNumber=" + modelNumber + ", manufacturer="
				+ manufacturer + "]";
	}
	
}
