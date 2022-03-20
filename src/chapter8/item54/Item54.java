package chapter8.item54;

import java.util.ArrayList;
import java.util.List;

public class Item54 {

    static List<Cheese> cheesesInStock = new ArrayList<>();

    public static void main(String[] args) {
        List<Cheese> cheeses = getCheeses();
        if (cheeses != null && cheeses.contains(new Cheese()))
            System.out.println("That's right!");

    }

    public static List<Cheese> getCheeses(){
        // 컬렉션이 비었으면 null을 반환
        return cheesesInStock.isEmpty() ? null
                : new ArrayList<>(cheesesInStock);
    }
}

class Cheese{

}
