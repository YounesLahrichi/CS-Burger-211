/*
CS211 Assignment 2
Younes Lahrichi
Phone Number: 425-445-9590
Student ID: 950-708-891
10-06-2020, Fall Quarter 2020
This program is the Super class to the burger chain app that we developed
*/
package younes;
//this is the main super abstract class that contains all the basic information
public abstract class burger211 {
	static private String name1, name2, name3;
	static private String topping1, topping2, topping3;
	static private double price1, price2, price3;
	//this is the where the information gets called
	burger211() {
		   price();
		   topping();
		   name();
		 }

	abstract void Menu (String franchise);
	// this is the constructor regarding the price variables
	 void price(){
		    price1=3.0;
		    price2=2.0;
		    price3=3.5;
		  }
	 //this is when you make the "get price1" variable = to the original price 1
	 	public double getPrice1() { 
		  return price1;
		 }
	 //this is when you make the "get price2" variable = to the original price 2
		 public double getPrice2() { 
		  return price2;
		 }
	 //this is when you make the "get price3" variable = to the original price 3
		 public double getPrice3() { 
		  return price3;
		 }
		// this is the constructor regarding the topping variables
		 void topping() {
			 topping1 = "beef patty, tomato, onion, ranch source";
			 topping2 = "beef patty, lime, onion, lettuce, tomato source";
			 topping3 = "chicken breast, gallo, onion, ranch source";
		 }
		//this is when you make the "get topping1" variable = to the original topping 1
		 public String getTopping1() {
			 return topping1;
		 }
		//this is when you make the "get topping2" variable = to the original topping 2
		 public String getTopping2() {
			 return topping2;
		 }
		//this is when you make the "get topping3" variable = to the original topping 3
		 public String getTopping3() {
			 return topping3;
		 }
		// this is the constructor regarding the name variables
		 void name() {
			name1="Inheritance Burger";
			name2="Overriding Burger";
			name3="Polymorphism Burger";
		 }
		 //this is when you make the "getName1" variable = to the original name 1
		 public String getName1() {
			 return name1;
		 }
		//this is when you make the "getName2" variable = to the original name 2
		 public String getName2() {
			 return name2;
		 }
		//this is when you make the "getName3" variable = to the original name 3
		 public String getName3() {
			 return name3;
		 }
		 //this is the promotion string
		public String getAdvertising() {
			String Promotion = "^ Buy One Get One ZERO % off - CS211 Student Only ^";
			return Promotion;
		}
	
		
}

