
package file;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
          File file=new  File("D:\\Math class note//.txt");
            Scanner reader=new  Scanner(file);
            while(reader.hasNext()){
                String Id=reader.next();
                String name=reader.next();
                System.out.println(Id);
                System.out.println(name);
                
            reader.close();
           
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
