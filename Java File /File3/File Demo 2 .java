package file23;

import java.util.Formatter;

public class FileDemo26 {
    public static void main(String[] args) {
        try{
           Formatter formatter =new Formatter("D:\\prince sir class note Discrete mathmatics//Cse.txt");  
         formatter.format("%s %s\r\n","24","saiyam");
         formatter.format("%s %s\r\n","25","iftiqur");
         formatter.format("%s %s\r\n","26","ratul");
         formatter.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
    }
    
}

