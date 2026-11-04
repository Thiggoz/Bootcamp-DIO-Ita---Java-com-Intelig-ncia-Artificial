package exercicios.heranca_e_poliformismo.ex01;

public abstract class Ticket {

    private double baseValue;

    private String movie;

    private boolean legend;

    public Ticket(double baseValue, String movie, boolean legend) {
        this.baseValue = baseValue;
        this.movie = movie;
        this.legend = legend;
    }

    public abstract double getRealValue();

    public String getAudioType(boolean legend){return legend ? "Legendado" : "Dublado";}


    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double value) {
        this.baseValue = value;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isLegend() {
        return legend;
    }

    public void setLegend(boolean legend) {
        this.legend = legend;
    }
}
