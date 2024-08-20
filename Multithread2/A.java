package learncoding;
class A extends Thread{
     public void run(){
     String name=Thread.currentThread().getName();
     for(int i=0;i<3;i++){
         System.out.println(name);
     }
 }
     public static void main(String[] args) throws UnsupportedOperationException, InterruptedException{
         A t1=new A();
         A t2=new A();
         A t3=new A();
         t1.setName("ratul");
         t2.setName("rana");
         t3.setName("rana");
         
         t1.start();
          t2.start();
        /* Thread.sleep(1000);
         t2.suspend();
         t2.resume();
          Thread.sleep(1000);
         t3.start();
 Thread.sleep(1000); // Sleep for 1 second to let t2 print some messages
   t2.suspend(); // Suspend t2
   Thread.sleep(1000); // Sleep for 1 second to let t2 be suspended
   t2.resume(); // Resume t2*/
   t3.start();
    Thread.sleep(1000);
   t1.interrupt();
     }
    
}

