package mnc.vir.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import mnc.vir.bean.item;

public class Order {
	
	@Override
	public String toString() {
		return "Order [list=" + list + "]";
	}

	private ArrayList<item> list;	 
	public Order(){
		list=new ArrayList<item>();
	}
	
	 
	public void addProduct(item i){
		 list.add(i);
	
	}//addProduct
	 
	public boolean removeProduct(item i)
	   {
return list.remove(i);
	
	
	}
	 
	public Collection getCartDetails(){
	return list;
	}
	 
	
	 
	public int productCount(){
	return list.size();
	}
	 
	  public double getCartPrice() {
	    double price = 0.0d;
	    Iterator iterator = getCartDetails().iterator();
	    while(iterator.hasNext()){
	      price+= ((item) iterator.next()).getCost();
	    }
	    return price;
	  }
	}


