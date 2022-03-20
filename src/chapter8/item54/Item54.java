package chapter8.item54;

import java.util.ArrayList;
import java.util.List;

public class Item54 {

    static List<Cheese> cheesesInStock = new ArrayList<>();

    public static void main(String[] args) {
        List<Cheese> cheeses = getCheeses();
        if (cheeses.contains(new Cheese()))
            System.out.println("That's right!");
    }

    public static List<Cheese> getCheeses(){
        return new ArrayList<>(cheesesInStock);
    }
}

class Cheese{

}
