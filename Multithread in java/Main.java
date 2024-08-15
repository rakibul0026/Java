package multiThread;
public class Main {
    public static void main(String[] args) {
        Runnable obj=new Runnable(){
            public void run(){
                System.out.println("Dipta");
            }
    };
        Thread t=new   Thread(obj);
        t.start();
}
}



