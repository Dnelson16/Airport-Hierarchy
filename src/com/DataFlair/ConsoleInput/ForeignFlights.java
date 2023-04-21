package com.DataFlair.ConsoleInput;
import java.util.*;
public class ForeignFlights
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where would you like to go?");
        String str = sc.nextLine();
        System.out.println("Your location is: " +str);
        System.out.println("How many tickets");
        int i = sc.nextInt();
        System.out.println("You have 2 total flights using " + i +" " + "tickets");
        System.out.println("Enter the last 4 digits of credit card");
        int d = sc.nextInt();
        System.out.println("Credit card verified " +d);
        System.out.println("Credit card approved");
        System.out.println("Thank you for your purchase!" );
    }
}