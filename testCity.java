import java.util.Scanner;

public class testCity {
    public static void main(String[] args){
        //Scanner scnr = new Scanner(System.in);
        String name = "bob";
        int age=21;
        int phoneNumber= 911;
        /*
        System.out.println("enter your name");
        name=scnr.nextLine();
        System.out.println("enter your age");
        age = scnr.nextInt();
        System.out.println("enter your phone number");
        phoneNumber = scnr.nextInt();
        */

        CityHall cityHall = new CityHall("jeremy's hall", "baker street");
        School school = new School("Jeremy's school", "north baker street");

        Police person1 = new Police(name, age, phoneNumber, 15);
        Teacher person2 = new Teacher("mary person", 67, phoneNumber, 8,"this is a certificate",15);
        Kid person3 = new Kid("little bob", 12, phoneNumber, "skittles");

        cityHall.addPerson(person1);
        school.addPerson(person2);
        school.addPerson(person3);

        System.out.println(cityHall.getPerson(person1).getName());
        //school.getPerson(person2).givePay();
        System.out.println(school.getPerson(person2).getAge());
        //System.out.println(school.getPerson(person3).getFavoriteCandy());
        //System.out.println(person3.getFavoriteCandy());
    }
}