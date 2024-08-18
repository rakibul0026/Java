

package file;

import java.io.FileWriter;

public class fileWriter {
    public static void main(String[] args) {
       try{
        FileWriter f= new FileWriter("D:\\person\\person//.txt"); 
        f.write("r");
        f.close();
       }catch(Exception e){
           System.out.println(e);
       }
      
    }
    
}

