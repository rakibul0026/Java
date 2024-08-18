package file;
import java.io.File;
import java.util.Scanner;
public class fileread32 {
    public static void main(String[] args) {
        try{
            File file=new File("D:\\prince sir class note Discrete mathmatics//cse.txt");
            Scanner reader= new Scanner(file);
    while(reader.hasNext()){
       String name= reader.next();
       String id=reader.next();
        System.out.println(name);
        System.out.println(id);
        
        
    }
} catch(Exception e){
            System.out.println(e);
}
    }
}

