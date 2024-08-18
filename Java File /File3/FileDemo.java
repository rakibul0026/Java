package file.newpackage;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileDemo2 {
    public static void main(String[] args) {
        String id, name;
        try {
            Formatter formatter = new Formatter("D:\\CT DISCRETE\\person//teacher.txt");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the number of records:");
            int num = input.nextInt();
            
            for (int i = 0; i < num; i++) {
                System.out.println("Enter the id and name:");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

