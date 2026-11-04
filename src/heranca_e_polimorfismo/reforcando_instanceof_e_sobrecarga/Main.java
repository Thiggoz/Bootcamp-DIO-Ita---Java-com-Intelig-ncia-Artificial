package heranca_e_polimorfismo.reforcando_instanceof_e_sobrecarga;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Salesman salesman = new Salesman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee);

    }

}
