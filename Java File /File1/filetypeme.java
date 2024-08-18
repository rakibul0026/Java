package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filetryme {
    public static void main(String[] args) {
        try{
           File file=new File ("D:\\prince sir class note Discrete mathmatics//cse.txt");
           Scanner reader=new Scanner(file);
           while(reader.hasNext()){
               String name=reader.next();
               String id=reader.next();
               System.out.println(id);
               System.out.println(name);
           }
        }catch(FileNotFoundException e){
            System.out.println(e); 
        }
    }
  
}

