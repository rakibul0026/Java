package file;

import java.io.FileWriter;

public class fileWriter23 {
    public static void main(String[] args) {
        try{
          FileWriter f=new FileWriter("D:\\Math class note//.txt"); 
          f.write("Wellcome to Bangladesh\n");
          f.write("Wellcome to CSTU");
          f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

