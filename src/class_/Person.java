package class_;

import java.time.OffsetDateTime;

public class Person {

    private String name;
    private int age;
    private int lastYearAgeInt = OffsetDateTime.now().getYear();

    public Person() {

    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void incAge() {
        if (this.lastYearAgeInt >= OffsetDateTime.now().getYear()) return;

        this.age = 1;
        this.lastYearAgeInt = OffsetDateTime.now().getYear();
    }

}
