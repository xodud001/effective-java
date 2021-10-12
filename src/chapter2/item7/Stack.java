package chapter2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

// 여기서 메모리 누수가 일어나는 위치는 어디인가?
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        elements[size++] = e;
    }
    // pop을 할 때 size 이후에 남아있는 객체들은 다 쓴 참조 때문에 가비지 컬렉터에서 회수되지 않는다
    // 활성 영역은 인덱스가 size보다 작은 영역의 원소들로만 이루어진다
    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
