package com.app.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import com.app.customordering.RatingOrder;
import com.app.utils.CricketerValidation;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;
			Map<String, Cricketer> cmap = new HashMap<>();
			while (!exit) {
				System.out.println(
						"Options :\n 1.Cricket sign up \n 2.Login \n 3.show all \n 4.modify cricketer rating \n 5.sort crickter according rating \n "
								+ "6.find cricketer by name");
				System.out.println("enter the choice");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enetr crickert details : name,age,email_id,phone_no,rating");
						Cricketer cricketer = CricketerValidation.validateCricketerInputs(sc.next(), sc.nextInt(),
								sc.next(), sc.next(), sc.nextInt(), cmap);

						cmap.put(cricketer.getEmail_id(), cricketer);

						System.out.println("Registration successfull....");
						break;

					case 2:

						break;
					case 3:
						System.out.println("Display all details");
						for (Cricketer c : cmap.values())
							System.out.println(c);
						break;

					case 4:
						System.out.println("entet criketer eamil and rating that you want to set");
						Cricketer cricketer2 = CricketerValidation.modifyRating(sc.next(), sc.nextInt(), cmap);

						break;
					case 5:

						LinkedList<Cricketer> list = new LinkedList<>(cmap.values());
						Collections.sort(list, new RatingOrder());
						System.out.println("sorting by rating ");
						for (Cricketer c : list)
							System.out.println(c);
                       break;
          
					case 6:
						System.out.println("enter a name ");
						CricketerValidation.findByName(sc.next(), cmap);

//				LinkedList<Customer>list = new LinkedList<>(customerMap.values());
//				Collections.sort(list, new OrderingByDobAndLname());
//				System.out.println("Sorting by DOB and lastName");
//				for(Customer c : list)
//					System.out.println(c);
						break;

					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}

	}
}
