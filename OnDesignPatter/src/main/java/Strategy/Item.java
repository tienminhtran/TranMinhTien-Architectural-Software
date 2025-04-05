package Strategy;/*
 * @description:
 * @author: TienMinhTran
 * @date: 29/3/2025
 * @time: 7:16 AM
 * @nameProject: Project_Architectural_Software
 */

public class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
