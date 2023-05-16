package Interface.factory_method.CreditCard;

public class CreditCardFactory {
    public static CreditCard getCreditCard(String creditCard){
        switch (creditCard){
            case "MoneyBank":
                return new MoneyBank();
            case "Platinun" :
                return new Platinun();
            case "Titanium" :
                return new Titanium();
            default:
                return null;
        }
    }
}
