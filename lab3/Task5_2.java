 // Gender, Person, DragonLaunch

 package lab3;

import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;
    private String name;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + gender + ")";
    }
}

public class Task5_2 {

    private Vector<Person> prisoners = new Vector<>();

    
    public void kidnap(Person p) {
        prisoners.add(p);
    }

    public boolean willDragonEatOrNot() {
        int balance = 0;

        for (Person p : prisoners) {
            if (p.getGender() == Gender.BOY) {
                balance++;
            } else { // GIRL
                balance--;
            }

            if (balance < 0) {
                balance = 0;
            }
        }

        return balance > 0;
    }

    public int leftCount() {
        int balance = 0;

        for (Person p : prisoners) {
            if (p.getGender() == Gender.BOY)
                balance++;
            else if (balance > 0)
                balance--;
        }
        return balance;
    }
}
