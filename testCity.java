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

        Police person1 = new Police(name, age, phoneNumber, 15);
        Teacher person2 = new Teacher("mary person", 67, phoneNumber, 8,"this is a certificate",15);
        Kid person3 = new Kid(name, 12, phoneNumber, "skittles");

        System.out.println(person1.getName());
        person2.givePay();
        System.out.println(person2.getAge());
        System.out.println(person3.getFavoriteCandy());
    }
}