package multiThread;
public class Test2 {
    public static void main(String[] args) {
       myThread t1=new  myThread();
       t1.start();
       
    } 
}
class  myThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class A{
    
}
