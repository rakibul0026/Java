package multiThread;
public class Test {
    public static void main(String[] args)throws InterruptedException {
      A obj=new A();//create a Thread step-1
      obj.start(); //t1
    
for(int i=0;i<10;i++)
    {
            System.out.println(2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) 
        {
            System.out.println(e);
        }
       }
     }
        
 }
    
    
class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++)
    {
            System.out.println(1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    }
    public void print(){
    
      }
    }
