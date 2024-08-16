package classwork;
public class JavaExceptionExample{  
	  public static void main(String args[]){  
		  System.out.println("Nothing");
	  
	   try{  
		   int x=25/0;
	   } catch(Exception e) {
		   
		   System.out.println(e);  
	  } 
	   finally {
		   System.out.println("Everything ");
	   }
	} 
}
