package com.netease.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("header")
public class StraightHeader implements Header {
	@Value("${color}")
	private String color;
	@Value("${size}")
	private int size;
	
	public void doWork() {
		System.out.println("The staightheader is doing work~");
	}

	public String getInfo() {
		return "StraightHeader: color="+color+", size="+size;
	}

}
