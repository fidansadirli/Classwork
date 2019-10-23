package class4;

import class4.Person;

public class PersonApp {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alex";
        System.out.println(Person.counter);

        Person ann = new Person("Ann");
        System.out.println(Person.counter);



        Person p2 = new Person();
        p1.name = "Dima";
        System.out.println(Person.counter);



        Person p3 = new Person();
        p1.name = "Sergo";
        System.out.println(Person.counter);


        Person.counter = 99;
        System.out.println(Person.counter);


        p1.name ="";
        p1.isMember = false;


    }
}
