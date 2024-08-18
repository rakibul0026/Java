
package file23;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {
        File dir =new File("D:\\person//name");
        dir.mkdir();
        String dirlocation=dir.getAbsolutePath();
        System.out.println("Dirlocation is : "+dirlocation);
        System.out.println(dir.getName());
        dir.delete();
        
    }
    
}

