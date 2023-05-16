package Interface.factory_method.CreditCard;

public class MoneyBank implements CreditCard{

    @Override
    public String getCardType() {
        return "MoneyBank";
    }

    @Override
    public int GetCreditLimit() {
        return 100000;
    }

    @Override
    public int GetAnnualCharge() {
        return 1000;
    }
}
