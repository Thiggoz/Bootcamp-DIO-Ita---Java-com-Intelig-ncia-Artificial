package exercicios.heranca_e_poliformismo.ex01;

public class FamilyTicket extends Ticket {

    private int numberOfPeople;

    private double value;

    public FamilyTicket(double baseValue, String movie, boolean legend, int numberOfPeople) {
        super(baseValue, movie, legend);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getRealValue() {
        double totalPrice = getBaseValue() * numberOfPeople;

        if (numberOfPeople >= 3) {
            totalPrice = totalPrice * 0.95;
        }

        return totalPrice;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

}
