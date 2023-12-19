package StringPrograms;

import java.util.Scanner;

public class Prog9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int len = str.length();

        int i=0;
        while(i<len){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                i++;
            }
            else{
                System.out.println("***Not containing only integers****");
                System.exit(0);
            }
        }
        System.out.println("Only contains integer");
    }
}
