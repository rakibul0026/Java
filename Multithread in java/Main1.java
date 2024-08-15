package multiThread;

public class Main1 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){
            public void run(){
                System.out.println("Dipta");
            }
    });
        
        t.start();
}
}



