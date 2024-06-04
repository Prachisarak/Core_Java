package com.app.customordering;

import java.util.Comparator;

import com.app.core.Cricketer;


public class RatingOrder implements Comparator<Cricketer>{
	

	

@Override
	public int compare(Cricketer o1, Cricketer o2) {
	   System.out.println("comapre rating");
	   
	   if(o1.getRating()<o2.getRating())
		   return -1;
	   if(o2.getRating()==o2.getRating())
		   return 0;
	   return -1;
	   
		
		
	}


}


