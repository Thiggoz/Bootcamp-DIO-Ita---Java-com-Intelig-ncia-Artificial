package exercicios.heranca_e_poliformismo.ex01;

public class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(double baseValue, String movie, boolean legend) {
        super(baseValue, movie, legend);
    }

    @Override
    public double getRealValue() {
        return getBaseValue() / 2;
    }

}