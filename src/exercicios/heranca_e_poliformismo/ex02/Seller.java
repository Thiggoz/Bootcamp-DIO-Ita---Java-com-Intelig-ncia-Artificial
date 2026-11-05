package exercicios.heranca_e_poliformismo.ex02;

public class Seller extends Employee {

    private int numberOfSales;

    public Seller(String name, String email, String password, int numberOfSales) {
        super(name, email, password, false);
        this.numberOfSales = numberOfSales;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void makeSale() {
        this.numberOfSales ++;
    }

    public double consultSales() {
        return numberOfSales;
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
