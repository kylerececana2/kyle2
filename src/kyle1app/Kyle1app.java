
package kyle1app;

import java.util.Scanner;


public class Kyle1app {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       String name;
       int byear;
       
       System.out.println("Enter your name: ");
       name = sc.nextLine();
       System.out.println("Enter your birth year: ");
       byear = sc.nextInt();
       
       System.out.println("Hello "+name+ " your age is "+(2025-byear));
               
    }
    
}
    
   