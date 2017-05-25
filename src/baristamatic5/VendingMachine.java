package baristamatic5;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */

/**
  * Declare public API for Vending Machine
**/



public interface VendingMachine {
	
	
	
    public void reset();	
    public void restock();
    public void dispenseItem(Menu menuItem); 
    public boolean hasMenuItem(Menu menuItem);
    public void updateIngreInventory(Menu menuItem);
    public String calculatePrice(Menu m);
	public void displayMenu();	
	public void displayCurrInventory();
	public void startup();
	
}
