class Zigzag {                                    
   public  static void main(String[] args) {      
       	int number = 123;
		
		int hundreds;
		int tens;
		int ones;
		int zigzag;		

		hundreds = number/100;
		tens = (number/10)%10;
		ones = number %10;		

		zigzag = ones*100 +
					 tens*10 +
					 hundreds;
    }                         
}                          
