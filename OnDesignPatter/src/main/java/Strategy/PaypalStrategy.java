package Strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:16 AM
 * @nameProject: Project_Architectural_Software
 */

public class PaypalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pay with Paypal: " + amount);
    }
}
