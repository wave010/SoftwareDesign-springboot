package com.example.demo;

public class CpuPart implements PartService {
	private String info;
	
	public CpuPart(String series) {
		this.info = series;
	}
	@Override
	public String getinfo() {
		return info;
	}
}
