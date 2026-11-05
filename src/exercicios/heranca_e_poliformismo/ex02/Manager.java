package exercicios.heranca_e_poliformismo.ex02;

public class Manager extends Employee {

    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    }

    public void makeFinancialReport() {

    }

    public void getSales() {

    }

    public void login() {

    }

    public void logoff() {

    }

    public void changeData(String email) {
        setEmail(email);
    }

    public void changeData(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
    }

    public void changePassword(String password) {
        setPassword(password);
    }

}
