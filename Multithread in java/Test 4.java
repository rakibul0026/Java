package multiThread;
public class Test4 {
     public static void main(String[] args) {
       myThread obj=new  myThread();
      
      Thread t1=new Thread(obj,"my thread 1");//thread name
      t1.start();//create thread
       
 System.out.println("inside the main method: "+Thread.currentThread().getName());//current Thread
     
    } 
}
class  myThread extends A implements Runnable{
    public void run(){
        System.out.println("Inside the run method :"+Thread.currentThread().getName());
        for(int i=0;i<3;i++){
            System.out.println("1");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

