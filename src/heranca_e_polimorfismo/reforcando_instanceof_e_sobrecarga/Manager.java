package heranca_e_polimorfismo.reforcando_instanceof_e_sobrecarga;

public class Manager extends Employee {

    public Manager() {

    }

    public Manager(String code, String name, String address, int age, double salary, String login, String password, double commission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    @Override
    public String getCode() {
        return "MN" + super.getCode();
    }

    public double getFullSalary() {
        return this.salary + this.commission;
    }

    private String login;

    private String password;

    private double commission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
