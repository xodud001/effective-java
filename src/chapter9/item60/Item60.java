package chapter9.item60;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Item60 {

    public static void main(String[] args) {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00"); // 1달러

        // 물건을 10센트, 20센트, 30센트.... 순으로 구매
        for (BigDecimal price = TEN_CENTS;
                funds.compareTo(price) >= 0;
                price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        // 10센트, 20센트, 30센트, 40센트면 1달러기 때문에
        // 4개가 구매되어야 하지만 실제론 3개가 구매된다.
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈(달러) = " + funds);
    }
}
