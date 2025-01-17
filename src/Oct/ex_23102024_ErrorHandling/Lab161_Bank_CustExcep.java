package Oct.ex_23102024_ErrorHandling;

public class Lab161_Bank_CustExcep {
    private String currency;
    private Integer amount;

    public Lab161_Bank_CustExcep(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Lab161_Bank_CustExcep bankname) {
        if (!bankname.currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("This currency is not valid, we cant give total");
            } catch (Exception e) {
                System.out.println("Currency Mismatch");
            }
        } else {
            return bankname.amount + this.amount;
        }
        return 0;
    }
}
