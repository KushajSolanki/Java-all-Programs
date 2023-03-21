import java.util.*;
import java.util.jar.Attributes.Name;

import org.w3c.dom.NameList;

class Amazon{
	public String name;
	public double rating;
	public double price;
	public double dom;
	
	public Amazon(String name, double rating, double price,double dom){
		this.name=name;
		this.rating=rating;
		this.price=price;
		this.dom=dom;	
	}
	
	public double Offer() {
		return 0;
	}
}

class Textile extends Amazon{
	public Textile(String name, double rating, double price,double dom) {
		super(name,rating,price,dom);
	}
	public double Offer() {
		
		if (this.dom==1) {
			return 25.0;
			
		}
		else if(this.dom==2) {
			return 35.0;
			
		}
		else{
			return 50.0;
		}
		
	}
}

class Electronics extends Amazon{
	public Electronics(String name, double rating, double price,double dom) {
		super(name,rating,price,dom);
	}
	public double Offer() {
		
		if (this.dom==1) {
			return 25.0;
		}
		else if(this.dom==2) {
			return 35.0;
		}
		else{
			return 50.0;
		}	
	}
} 

class HomeAppliances extends Electronics{
	public HomeAppliances(String name, double rating, double price,double dom) {
		super(name,rating,price,dom);
	}
	public double Offer() {
		
		if (this.dom==1) {
			return 25.0;
		}
		else if(this.dom==2) {
			return 35.0;	
		}
		else{
			return 50.0;
		}
		
	}
}

public class Discount {
	public static void main(String[] args) 
	{
		Amazon obj=new Textile("US POLO Shirt",3.8,6000,1);
		Amazon obj1=new Electronics("Laptop",4.6,80000,0.5);
		Amazon obj2=new HomeAppliances("Philips Bulb",4.2,60,2);
		
		double DisOnShirt=obj.Offer();
		double DisOnLaptop=obj1.Offer();
		double DisOnBulb=obj2.Offer();
		
		System.out.println(obj.name+" that has a rating of "+obj.rating+" and price of "+obj.price+" has a discount of "+DisOnShirt+"%");
		System.out.println(obj1.name+" that has a rating of "+obj1.rating+" and price of "+obj1.price+" has a discount of "+DisOnLaptop+"%");
		System.out.println(obj2.name+" that has a rating of "+obj2.rating+" and price of "+obj2.price+" has a discount of "+DisOnBulb+"%");
		
		System.out.println("New price of "+obj.name+" is "+(obj.price-(obj.price)*DisOnShirt/100));
		System.out.println("New price of "+obj1.name+" is "+(obj1.price-(obj1.price)*DisOnLaptop/100));
		System.out.println("New price of "+obj2.name+" is "+(obj2.price-(obj2.price)*DisOnBulb/100));
		
	}

}

