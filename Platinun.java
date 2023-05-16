package Interface.factory_method.CreditCard;

public class Platinun implements CreditCard{
    @Override
    public String getCardType() {
        return "Platinun";
    }

    @Override
    public int GetCreditLimit() {
        return 1000000;
    }

    @Override
    public int GetAnnualCharge() {
        return 100;
    }
}
