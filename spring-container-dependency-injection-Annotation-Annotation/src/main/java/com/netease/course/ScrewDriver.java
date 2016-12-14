package com.netease.course;

import org.springframework.beans.factory.annotation.Autowired;

public class ScrewDriver {
	@Autowired
	private Header header;
	

	
		public void use(){
			System.out.println("Here the "+header.getInfo()+" screwdriver is being used by Jacky Wang!");
			header.doWork();
		}
				
		public void init (){
			System.out.println("Here we are initializing the Screwdriver!");
		}
		
		public void cleanup (){
			System.out.println("Over here, we are cleanning up the screwdriver!");
		}
}
