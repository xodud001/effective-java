package chapter5.item26;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    // parameterized type으로 정의해서 타입 안정성을 확보.
    private final Collection<Stamp> stamps = new ArrayList<>();

    public static void main(String[] args) {
        Test test = new Test();

        test.stamps.add(new Stamp());

        for (Stamp stamp : test.stamps) {
            stamp.cancel();
        }
    }
}
class Stamp{
    public void cancel(){

    }
}
class Coin{

}
