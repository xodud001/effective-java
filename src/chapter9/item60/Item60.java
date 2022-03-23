package chapter9.item60;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Item60 {

    public static void main(String[] args) {
        int itemsBought = 0;
        int funds = 100; // 100센트

        // 물건을 10센트, 20센트, 30센트.... 순으로 구매
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈(달러) = " + funds);
    }
}
