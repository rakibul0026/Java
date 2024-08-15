
package multiThread;
public class test7 {
   
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Dipta t1=new Dipta();//thread class ar object
       
        
        t1.setDaemon(true);
        
        t1.start(); //create thread class
        
        
 System.out.println("Main Thread ended and x= "+t1.x);
        }
}
class Dipta extends Thread{
    int x;
    public void run(){
        for(int i=0;i<100000;i++){
            x++;   
        }
      System.out.println("Main Thread ended and x="+x);
    }
    
}
