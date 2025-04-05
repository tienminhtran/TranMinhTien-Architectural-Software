package Strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:15 AM
 * @nameProject: Project_Architectural_Software
 */

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Pay with Credit Card: " + amount);
    }
}
