import java.util.Scanner;

public class testCity {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String name = "";
        int age=0;
        int phoneNumber;

        System.out.println("enter your name");
        name=scnr.nextLine();
        System.out.println("enter your age");
        age = scnr.nextInt();
        System.out.println("enter your phone number");
        phoneNumber = scnr.nextInt();

        Person person = new Person(name, age, phoneNumber);
    }
}