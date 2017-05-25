package baristamatic5;

public enum Ingredients {
	
	COCOA("Cocoa", 0.90), COFFEE("Coffee", 0.75), CREAM("Cream", 0.25), DECAFCOFFEE("Decaf Coffee", 0.75), ESPRESSO("Espresso", 1.10), FOAMMILK("Foamed Milk", 0.35), STEAMMILK("Steam Milk", 0.35), SUGAR("Sugar", 0.25), WHIPCREAM("Whipped Cream", 1.00);
	   
    private String name;
    private double price;
   
    private Ingredients(String name, double price){
        this.name = name;
        this.price = price;
    }
   
    public String getName(){
        return name;
    }
   
    public double getPrice(){
        return price;
    }

	

}
