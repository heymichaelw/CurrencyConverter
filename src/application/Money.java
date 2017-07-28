package application;

import java.text.DecimalFormat;

public class Money {

    private String currency;
    private double amount;


    public Money(double amount, String currency) {
        switch(currency){
            case "USD":
                this.amount = amount;
                break;
            case "EUR":
                this.amount = Double.parseDouble(getRoundedResult(amount * 0.858));
                break;
            case "JPY":
                this.amount = Double.parseDouble(getRoundedResult(amount * 111.848));
                break;
            case "BTC":
                this.amount = Double.parseDouble(getRoundedResult(amount * 0.0004));
                break;
        }
    }

    public double toUSD(){
        return (this.amount / 1);
    }

    public double toEUR(){
        return (Double.parseDouble(getRoundedResult(this.amount / 0.858)));
    }

    public double toJPY(){
        return (Double.parseDouble(getRoundedResult(this.amount / 111.848)));
    }

    public double toBTC(){
        return (Double.parseDouble(getRoundedResult(this.amount / 0.0004)));
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getRoundedResult(double value){
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(value);
    }
}
