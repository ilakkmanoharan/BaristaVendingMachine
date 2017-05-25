package baristamatic5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vending {

	public static void main(String[] args) {
		
		
		VendingMachine barista = VendingMachineFactory.createVendingMachine();
		
		barista.startup();
		
		Scanner reader = new Scanner(System.in);
		String c = null;
		
		while(reader.hasNext()){
		c = reader.next();
	
			
		
		String pattern = "[RrQq1-6]";
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher(c);
		
		if(!m.matches()){
			
			System.out.println("Invalid selection: " + c); 
			
			
		} else {
			
			
			switch(c.trim().charAt(0)){
			
			case 'R': 
			case 'r' :
				barista.restock();
				
				break;
				
			case 'Q' :
			case 'q' :
				
				System.exit(0);
				break;
				
			case '1' :
				
				barista.dispenseItem(Menu.AMERICANO);
				break;
				
			case '2' :
				
				barista.dispenseItem(Menu.LATTE);
				break;
				
				
			case '3' :
				
				barista.dispenseItem(Menu.MOCHA);
				break;
				
			case '4' :
				
				barista.dispenseItem(Menu.CAPPUCCINO);
				break;					
				
			case '5' :
				
				barista.dispenseItem(Menu.COFF);
				break;
				
				
			case '6' :
				
				barista.dispenseItem(Menu.DECAF);
				break;
				
				
			}
			
			barista.displayCurrInventory();
			barista.displayMenu();
			
			
			
			
		}
		
		
		}
		
		reader.close();
		

	}

}
