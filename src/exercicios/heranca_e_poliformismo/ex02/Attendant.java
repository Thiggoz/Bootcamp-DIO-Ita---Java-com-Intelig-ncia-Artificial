package exercicios.heranca_e_poliformismo.ex02;

public class Attendant extends Employee {

    private double cashOnHand;

    public Attendant(String name, String email, String password, double cashOnHand) {
        super(name, email, password, false);
        this.cashOnHand = cashOnHand;
    }

    public void getPayment(double value) {
        this.cashOnHand += value;
    }

    public void checkout() {

    }

    public void login() {

    }

    public void logoff() {

    }

    public void changeData(String email) {
        setEmail(email);
    }

    public void changePassword(String password) {
        setPassword(password);
    }

}
