package StringPrograms;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();
        int i=0;
        int len = str.length();

        while(i<len){
        if(ch[i]>='0' && ch[i]<='9')
//            if(ch[i]=='0' || ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='6' || ch[i]=='7' || ch[i]=='8' || ch[i]=='9')
            {
                ++i;
                }
            else {
                System.out.println("***Does not contains only integers*****");
                System.exit(0);
            }
        }
                System.out.println("Contains only integers");
    }
}
