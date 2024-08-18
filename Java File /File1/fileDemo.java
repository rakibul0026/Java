package file;
import java.io.File;
import java.io.IOException;

public class fileDemo1 {
    public static void main(String[] args) {
        File dir=new File("person");
        dir.mkdir();
        String path=dir.getAbsolutePath();
        File file1=new File(path+"student .txt");
      File file2=new File(path+"teacher .txt");
      try{
          file1.createNewFile();
          file2.createNewFile();
          System.out.println("file are created");
      }catch(IOException e){
          System.out.println(e);
          
     
    }
     file2.delete();
      file1.delete();
      if (file1.exists()){
          System.out.println("File is exist");
      }
          else
          System.out.println("file doesnot Exist");
      
       file1.delete();
       file2.delete();
  }
}
