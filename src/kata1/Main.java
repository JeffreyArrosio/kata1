package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pau Gasol", new Date(90,0,27));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
