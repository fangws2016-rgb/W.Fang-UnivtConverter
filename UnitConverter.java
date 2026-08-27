/*
    @author W.Fang
    8/27/2026
*/

import java.util.Scanner;

public class UnitConverter
{
    public static void main(String[] args)
    {
        int age = 33;
        char firstInitial = 'T';
        double value = 3.14;
        boolean awesome = true;
        String name = "johncena";

        System.out.println(age);
        System.out.println(firstInitial);
        System.out.println(value);
        System.out.println(awesome);
        System.out.println(name);

        System.out.println("Name:" + name);
        double height = 71; //java promotes smaller data types to larger ones

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = keyboard.nextLine();
        System.out.println("Welcome " + firstName);

        //Conversions

        double miles;
        double km;
        System.out.println("Enter miles and I will conver to km");
        System.out.print("miles: ");
        // double creates variables
        miles = keyboard.nextDouble();
        km = 1.6 * miles;
        System.out.print("km: " + km);

    }
}