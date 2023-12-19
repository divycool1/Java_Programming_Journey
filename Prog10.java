package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1 = sc.nextLine();
        str1 = str1.replace(" ","");
        str1 = str1.toLowerCase();
        char ch1[] = str1.toCharArray();
        System.out.println("Enter 2nd string");
        String str2 = sc.nextLine();
        str2 = str2.replace(" ","");
        str2 = str2.toLowerCase();
        char ch2[] = str2.toCharArray();

//        Logic-1
//        int i;
//        int j=0;
//
//        for( i=0; i<str1.length();i++){
//            if(str1.charAt(i)==str2.charAt(j)){
//                j++;
//            }
//        }
//        System.out.println("Strings are anagram");



        //Logic-2
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String strObj = new String();
        String sort1 = strObj.valueOf(ch1);
        System.out.println("Sorted 1st string\n"+sort1);
        String sort2 = strObj.valueOf(ch2);
        System.out.println("Sorted 2nd string\n"+sort2);

        boolean a = sort1.equals(sort2);
        if(a){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }


    }
}
