package exercicios.heranca_e_poliformismo.ex02;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Adão", "adaobola@email.com", "123456");
        System.out.printf("Nome: %s | E-Mail: %s | Senha: %s \n", manager.getName(), manager.getEmail(), manager.getPassword());
        manager.changeData("Joelma","joelma@email.com", "joelma123");
        System.out.printf("Nome: %s | E-Mail: %s | Senha: %s \n", manager.getName(), manager.getEmail(), manager.getPassword());

    }
}
