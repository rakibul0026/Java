
package file23;

import java.io.File;

public class fileDemo3 {
    public static void main(String[] args) {
        File dir=new File("//person");
        dir.mkdir();
        
        File file=new File ("D:\\person//cse.txt");
        try{
            file.createNewFile();
            System.out.println("file is create");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

