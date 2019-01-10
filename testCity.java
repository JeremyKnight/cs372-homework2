/**
 * This class tests the city to see if it actually works
 * @author Jeremy Knight
 */


import java.util.Scanner;

public class testCity {
    /**
     * runs the program
     */
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

        for(int i=0; i<cityHall.getNumberOfPeople(); i++){
            Police p = (Police)cityHall.getPerson(i);
            System.out.println(p.toString());
            p.givePay();
        }

        for(int i =0; i<school.getNumberOfPeople();i++){
            System.out.println(school.getPerson(i).toString());
            if(school.getPerson(i).getAge()>18) {
                Teacher p = (Teacher)school.getPerson(i);
                p.givePay();
            }
        }
        cityUI city = new cityUI();
        //System.out.println(school.getPerson(person3).getFavoriteCandy());
        //System.out.println(person3.getFavoriteCandy());
    }
}
