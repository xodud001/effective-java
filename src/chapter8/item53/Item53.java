package chapter8.item53;

public class Item53 {
    
    static int sum(int... args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

}
