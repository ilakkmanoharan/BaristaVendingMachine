package baristamatic5;




import java.util.Arrays;
import java.util.List;


public class VendingMachineImpl implements VendingMachine{

		
	    private Inventory<Ingredients> ingreInventory = new Inventory<Ingredients>();	   
	   
	    private Menu currentItem;	    
	     
	   
	    public VendingMachineImpl(){
	        initialize();
	    }
	   
	    private void initialize(){       
	      	       
	        for(Ingredients i : Ingredients.values()){
	            ingreInventory.put(i, 10);
	        }
	        
	      
	        
	   }
	   
	    @Override
	    public void dispenseItem(Menu menuItem) {
	        		   
		 if(hasMenuItem(menuItem)){
			 
			 currentItem = menuItem;
			 System.out.println("Dispensing: " + currentItem.getDrinkName());
	         updateIngreInventory(currentItem);
	           	            
	          
	        }else{
	        	
	        	System.out.println("Out of stock: " + menuItem.getDrinkName());
	        	
	        	
	        }
	    }  
	    
	    
	    
	    @Override
	    public void updateIngreInventory(Menu curr) {
	    	 for(Ingredients i: curr.getIngreMap().keySet()){
	    		 
	    		 int p = curr.getIngreMap().get(i);
	    		 
	    		 while(p-- > 0){
	    			 
	    			 ingreInventory.deduct(i);    			 
	    			 
	    			 
	    		 }	    		 
	    	 }
	                         
	        
	    }
	    
	    
	   @Override
        public boolean hasMenuItem(Menu menuItem){
		   		   
		 for(Ingredients i: menuItem.getIngreMap().keySet()){
			 
			 if(menuItem.getIngreMap().get(i) > ingreInventory.getQuantity(i)){
			 
				 return false;
			 
			 }
					 
		 }
		 
		 return true;
		   
        }
		   
			
	   
	   
	   @Override
	    public void restock(){
	        
	        ingreInventory.clear();
	        
	        initialize();
	        
	        currentItem = null;
	        
	    } 
	   
	
	   
	    @Override
	    public void reset(){
	        
	        ingreInventory.clear();
	        
	        currentItem = null;
	        
	    } 
	       
	  
	    
	    @Override
	     public void startup(){
	    	 displayCurrInventory();
	    	 displayMenu();
	     }
	    
	    
	    @Override
         public void displayCurrInventory(){      	 
        	 
	    	
	    	displayInventory();
	    	
        	 
         }
	    
	    @Override
	    public String calculatePrice(Menu m){
	    	
	    	double totalprice = 0.00;
	    	//double finalValue = 0.00;
	    	    	
	    	 for(Ingredients i: m.getIngreMap().keySet()){
	    
	    		 double uprice = i.getPrice() * m.getIngreMap().get(i);	     
	    		 totalprice = totalprice + uprice;    	
	    		 
	    	 }
	    	 
	    	    	 
	    	 double roundOff =  Math.round(totalprice * 100) / 100.00; 
	    	 
	    	 return String.format("%.2f", roundOff); 
	    	 
	    	
	    }
         
	      
	      @Override
          public void displayMenu(){       	  
       
        	  
        	  System.out.println("Menu: " + "\n");       	  
        
        	  
        	  List<Menu> enumList = Arrays.asList(Menu.values());
        	  
        	  for(Menu m: enumList){      		  
        		
        		  
        		  System.out.println(m.getDrinkNum() + "," + m.getDrinkName() + ","+ "$"  +  calculatePrice(m) + "," + hasMenuItem(m) + "\n");  
        	  }
        	 
     
         }
	      
	      
	      
	      public void displayInventory() {
	      	
	         	
	      	System.out.println("Inventory:" + "\n");
	    
	      	
	      List<Ingredients> enumList = Arrays.asList(Ingredients.values());
	     	  
	     	  for(Ingredients m: enumList){      		  
	     		
	     		  
	     		  System.out.println(m.getName() + "," + ingreInventory.getQuantity(m) + "\n");  
	     	  }
	      	
	      
	      }

		
	        
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
          
         
}
