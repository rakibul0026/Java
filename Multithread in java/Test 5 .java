
package multiThread;
public class Test5 {
    public static void main(String[] args) {
        Dipta t1=new Dipta();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.x);
        }
}
class Dipta extends Thread{
    int x;
    public void run(){
        for(int i=0;i<10000;i++){
            x++;
        }
    }
    
}
