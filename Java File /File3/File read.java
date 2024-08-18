package file23;

import java.io.File;

import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        
        try{
          File file=new File("D:\\prince sir class note Discrete mathmatics//cse.txt"); 
          Scanner scanner =new Scanner(file);
          while(scanner.hasNext()){
             String id=scanner.next();
              String name=scanner.next();
              System.out.println("the id is:"+id);
              System.out.println("the name is:"+name);
          }
          scanner .close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

