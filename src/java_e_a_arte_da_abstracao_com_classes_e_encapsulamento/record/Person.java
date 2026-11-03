package java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.record;

public record Person(String name, int age) {

    public Person{
        System.out.println("========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("========");
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " age: " + age;
    }

}
