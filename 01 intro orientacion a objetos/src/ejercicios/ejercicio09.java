package ejercicios;

public class ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("version1");
		
		int mult37 = 0, mult3 = 0, mult7 =0;
		for(int i=1; i<=250; i ++) {
			if (i%3 == 0)
				mult3++;
			if (i%7 == 0)
				mult7 ++;
			if (i%3 == 0 && i%7 == 0) {
				System.out.println("mult 3 y 7 :"+ i);
			mult37++;}
		}
			System.out.println("mult 3 :"+ mult3);
			System.out.println("mult 7 :"+ mult7);
			System.out.println("mult 37 :"+ mult37);
			System.out.println("de ninguno :" +(250- mult3-mult7 + mult37));
			
				
				
					
					
			
			
			
			
					
			System.out.println("version 2");		
					
//	version 2
				
			mult37 = 0;
			mult3 = 0; 
			mult7 =0;
            for(int i=1; i<=250; i ++) 
            	
           {
            	if (i%3 != 0 && i%7 !=0) 
            	continue;
            	  if (i%3 == 0 && i%7 == 0) {
            		mult3++;
            		mult7++;
            		mult37++;
            		System.out.println("es multiplo de 37:"+ i);
            	  }
            	  else
            		  if(i%3 == 0)
            			  mult3++;
            		  else
            			  mult7 ++;
            	    }	     
        
            
	System.out.println("mult 3 :"+ mult3);
	System.out.println("mult 7 :"+ mult7);
	System.out.println("mult 37 :"+ mult37);
	System.out.println("de ninguno :" +(250- mult3-mult7 + mult37));
	
		
}
}
			
			
	
	
	
	
			
			
		




