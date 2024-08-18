package file23;

import java.io.FileWriter;

public class fileWriter {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("D:\\oop question class test//cstu.txt");
            f.write("ratul khan");
            f.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

