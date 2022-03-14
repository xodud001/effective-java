package chapter7.item47;

import java.util.stream.Stream;

public class Item47 {

    public static void main(String[] args) {
        // 어댑터로 해결
        for (ProcessHandle ph : iterableOf(ProcessHandle.allProcesses())){

        }
    }

    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }
}
