package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =  new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int qtyOrdered = 0;
	
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
        	itemsOrdered[qtyOrdered] = disc;
        	qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    for (int i = 0; i <= qtyOrdered; i++) {
	    		if (itemsOrdered[i] == disc) itemsOrdered[i] = null;
	    	}
	    	qtyOrdered--;
    }
    
    public float totalCost() {
    	float cost = 0;
    	for (int i = 0; i < qtyOrdered; i++) {
    		cost += itemsOrdered[i].getCost();
    	}
    	return cost;
    }

    public String toString() {
    	String res = "***********************CART***********************\n" + "Ordered Items:\n";
    	for (int i = 1; i <= qtyOrdered; i++) {
    		String tmp = i + ". " + itemsOrdered.toString() + "\n";
    		res += tmp;
    	}
    	res = res + "Total cost: " + this.totalCost() + "\n***************************************************";
    	return res;
    }
    
}
