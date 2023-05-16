package Interface.factory_method.CreditCard;

public class Titanium implements CreditCard{

    @Override
    public String getCardType() {
        return "Titanium";
    }

    @Override
    public int GetCreditLimit() {
        return 100000 ;
    }

    @Override
    public int GetAnnualCharge() {
        return 120;
    }
}
