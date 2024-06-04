package com.app.utils;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Cricketer;
import com.app.customexception.CricketerException;

public class CricketerValidation {

	public static void checkForDupCricketer(String email, Map<String, Cricketer> map) throws CricketerException {

		if (map.containsKey(email))
			throw new CricketerException("Duplicate Email!!!!");
	}
	
	public static Cricketer modifyRating(String email,int NewRating,Map<String,Cricketer> cmap) {
		Cricketer cricketer =  cmap.get(email);
		if(cricketer!=null){
		    cricketer.setRating(NewRating);
		}
		return cricketer ;
		
	}
	
	public static void findByName(String name , Map<String, Cricketer> cmap)throws CricketerException {
		
		for(Cricketer c: cmap.values()) {
			if(c.getName().equals(name)) {
				System.out.println(c);
			}
			
			else throw new CricketerException("invalid name");
		}
	}
	
	



	
	public static Cricketer validateCricketerInputs(String name,int  age,String email_id,String 
			Phone_no,int rating ,Map<String,Cricketer> cmap ) throws CricketerException {
		
		checkForDupCricketer(email_id, cmap);
		
		return new Cricketer(name, age, 
				email_id, Phone_no, rating);
	
		    
	}

}
