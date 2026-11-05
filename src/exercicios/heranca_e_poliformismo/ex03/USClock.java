package exercicios.heranca_e_poliformismo.ex03;

public non-sealed class USClock extends Clock {

    private String peroidIndicator;

    public String getPeriodIndicator() {
        return peroidIndicator;
    }

    public void setBeforeMidDay() {
        this.peroidIndicator = "AM";
    }

    public void setAfterMidDay() {
        this.peroidIndicator = "PM";
    }

    public void setHour(int hour) {
        setBeforeMidDay();
        if (hour > 12 && hour <= 23) {
            setAfterMidDay();
            this.hour = hour ;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        return null;
    }

}
