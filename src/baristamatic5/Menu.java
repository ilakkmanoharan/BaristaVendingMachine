package baristamatic5;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */


import java.util.EnumMap;

public enum Menu {
	
	
	AMERICANO(1, "Caffee Americano"){
		
       
       public EnumMap<Ingredients, Integer> getIngreMap(){
    	   
    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
    	   
    	   ingreMap.put(Ingredients.ESPRESSO, 3);
    	   
    	   return ingreMap;
       }
         	
		
	}, 
	
	LATTE(2, "Caffee Latte"){
		
		  @Override
		  public EnumMap<Ingredients, Integer> getIngreMap(){
	    	   
	    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
	    	   
	    	   ingreMap.put(Ingredients.ESPRESSO, 2);
	    	   ingreMap.put(Ingredients.STEAMMILK, 1);   	   
	    	   	    	   
	    	   return ingreMap;
	       } 
		
	
		
	}, 
	
	MOCHA(3, "Caffee Mocha"){
		
		  @Override
		  public EnumMap<Ingredients, Integer> getIngreMap(){
	    	   
	    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
	    	   
	    	   ingreMap.put(Ingredients.ESPRESSO, 1);
	    	   ingreMap.put(Ingredients.COCOA, 1);
	    	   ingreMap.put(Ingredients.STEAMMILK, 1);
	    	   ingreMap.put(Ingredients.WHIPCREAM, 1);
	    	   
	    	   return ingreMap;
	       } 
		  		  
		  		
	}, 
	
		
	
	CAPPUCCINO(4, "Cappuccino"){
		
		@Override
		public EnumMap<Ingredients, Integer> getIngreMap(){
	    	   
	    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
	    	   
	    	   ingreMap.put(Ingredients.ESPRESSO, 2);	    	  
	    	   ingreMap.put(Ingredients.STEAMMILK, 1);
	    	   ingreMap.put(Ingredients.FOAMMILK, 1);
	    	   
	    	   return ingreMap;
	       } 
	
		
	}, 
		
	
	
	COFF(5, "Coffee"){
		
		@Override
		  public EnumMap<Ingredients, Integer> getIngreMap(){
	    	   
	    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
	    	   
	    	   ingreMap.put(Ingredients.COFFEE, 3);	    	  
	    	   ingreMap.put(Ingredients.SUGAR, 1);
	    	   ingreMap.put(Ingredients.CREAM, 1);
	    	   
	    	   return ingreMap;
	       } 
		  
		  
	}, 
	
	
	DECAF(6, "Decaf Coffee"){
		
	
		  @Override
		  public EnumMap<Ingredients, Integer> getIngreMap(){
	    	   
	    	   EnumMap<Ingredients, Integer> ingreMap = new EnumMap<Ingredients, Integer>(Ingredients.class);
	    	   
	    	   ingreMap.put(Ingredients.DECAFCOFFEE, 3);	    	  
	    	   ingreMap.put(Ingredients.SUGAR, 1);
	    	   ingreMap.put(Ingredients.CREAM, 1);
	    	   
	    	   return ingreMap;
	       } 	  
		  
		
	};
	   
    private int drinkNum;
    private String drinkName;    
   
    private Menu(int drinkNum, String drinkName){
        this.drinkNum = drinkNum;
        this.drinkName = drinkName;        
    }
   
    public int getDrinkNum(){
        return drinkNum;
    }
    
    public String getDrinkName(){
        return drinkName;
    }
         
    public abstract EnumMap<Ingredients, Integer> getIngreMap();
    	


}
