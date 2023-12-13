package StringPrograms;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
//        System.out.println(str);

        char ch[] = str.toCharArray();
        int len = str.length();

        int i=1;
        ch[0]=(char)(ch[0]-32);

        while(i<len){
            if(ch[i]==' ') {
                ch[i+1] = (char) (ch[i+1] - 32);
            }
            i++;
        }
        String strObj = new String();
        String a = strObj.valueOf(ch);
        System.out.println("Final:-"+a);
    }
}
