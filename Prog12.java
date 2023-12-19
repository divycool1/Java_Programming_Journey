package StringPrograms;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toUpperCase();
        str = str.replace(" ","");

        char ch[] = str.toCharArray();
        int len = str.length();

        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int i=0;
        while(i<len){
            int j=ch[i]-65;
            a[j]=1;
            ++i;
        }


         i=0;
        while(i<len){
            if(a[i]==1){
                ++i;
            }
            else{
                System.out.println("***Not pangram****");
                System.exit(0);
            }
        }
        System.out.println("Pangram string");

    }
}
