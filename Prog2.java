package StringPrograms;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = a.nextLine();
        str = str.concat("\0");
       char b[] = str.toCharArray();
       int i=0;
       int count=0;
       while(b[i]!='\0'){
           count++;
           i++;
       }
        System.out.println("Length:-"+count);

    }
}
