package chapter8.item53;

public class Item53 {

    // 인수가 1개 이상이어야 할 때 가변인수를 제대로 사용하는 방법
     static int min(int firstArg, int... remainingArgs){
        int min = firstArg;
        for (int arg : remainingArgs)
            if(arg < min)
                min = arg;
        return min;
    }

}
