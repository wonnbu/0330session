package likelion;

public class MilkTea extends Beverage {

    private int sweetness; // 당도

    public MilkTea(String name, int price, int stock, int sweetness) {
        super(name, price, stock);
        this.sweetness = sweetness;
    }

    @Override
    public void displayInfo() {
        System.out.println("이름: " + getName());
        System.out.println("가격: " + getPrice() + "원");
        System.out.println("재고: " + getStock() + "개");
        System.out.println("당도: " + sweetness + "%");
    }
}