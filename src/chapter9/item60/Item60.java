package chapter9.item60;

public class Item60 {

    public static void main(String[] args) {
        double funds = 1.00; // 1달러
        int itemsBought = 0;
        // 물건을 10센트, 20센트, 30센트.... 순으로 구매
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        // 10센트, 20센트, 30센트, 40센트면 1달러기 때문에
        // 4개가 구매되어야 하지만 실제론 3개가 구매된다.
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈(달러) = " + funds);
    }
}
