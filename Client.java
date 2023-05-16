package Interface.factory_method.CreditCard;

import java.text.DecimalFormat;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = CreditCardFactory.getCreditCard("MoneyBank");
        if (creditCard != null) {
            System.out.println(creditCard.getCardType());
            DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
            int mooney = creditCard.GetCreditLimit();
            System.out.println(decimalFormat.format(mooney));
            int Ann = creditCard.GetAnnualCharge();
            System.out.println(decimalFormat.format(Ann));
            }
        }
    }

