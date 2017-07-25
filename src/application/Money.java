package application;

public class Money {

    private String currency;
    private double amount;


    public Money(double amount, String currency) {
        switch(currency){
            case "USD":
                this.amount = amount;
                break;
            case "EUR":
                this.amount = amount * 0.858;
                break;
            case "JPY":
                this.amount = amount * 111.848;
                break;
            case "BTC":
                this.amount = amount * 0.0004;
                break;
        }
    }

    public double toUSD(){
        return (this.amount / 1);
    }

    public double toEUR(){
        return (this.amount / 0.858);
    }

    public double toJPY(){
        return (this.amount / 111.848);
    }

    public double toBTC(){
        return (this.amount / 0.0004);
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}
