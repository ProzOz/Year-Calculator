package com.company;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What time your want to change to another time? \nA:Buddhism Time To Christian Time        B:Chritian Time To Buddhism Time");
        String user_result = sc.nextLine();
        if (user_result.equals("A")){
            System.out.println("Next Question");
        } else if(user_result.equals("B")){
            System.out.println("Next Question");
        } else {
            System.out.println("You Answer Wrong Question :[");
            System.exit(0);
        };
        System.out.println("Enter Your Years Here: ");
        int user_years = sc.nextInt();

        if(user_result.equals("A")){
            System.out.print(user_years -= 543 );
            System.out.println(" A.D.");
        } else if (user_result.equals("B")){
            System.out.print(user_years += 543);;
            System.out.println(" A.D.");
        } else {
            System.out.println("You enter the wrong answer :]") ;
            System.exit(0);
        }



    }
}
