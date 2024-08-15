
package multiThread;

public class test23 {
    
    public static void main(String[] args) {
       myThread t1=new  myThread();
       Thread t2=new Thread(t1);//create a Thread
       t2.start();//create a Thread
       t2.suspend();
       
    } 
}
class  myThread extends A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("1");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class A{
    
}
