package practiceexamples;

import java.util.Scanner;

public class matchingofcharacter {
    public static void main(String[] args) {
        String str1 = "Welcome to carrertuner";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character you want to find");
        String str2 = sc.next();
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}
