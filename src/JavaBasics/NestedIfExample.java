package JavaBasics;

public class NestedIfExample {

	public static void main(String[] args) {
     double amountCust=430.00;
	
     
     if(amountCust>=600){
    	 System.out.print("Sell DELL");
     }else if(amountCust >=400.00 && amountCust<=450.00 ) {
    	  
    	 System.out.print("Sell Lenova");
     }else if(amountCust <=400.00){
    	 
    	 System.out.print("Sell HP");
     }
		
	}

}
