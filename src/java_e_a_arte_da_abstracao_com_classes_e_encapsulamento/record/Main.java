package java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.record;

public class Main {

    public static void main(String[] args) {

        var person = new Person("João");
        System.out.println(person.getInfo());
        System.out.println(person.name());

    }

}
