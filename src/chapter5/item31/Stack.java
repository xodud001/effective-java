package chapter5.item31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

// 아이템 7에서 다룬 Stack을 제네릭으로 변경
public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        // 반환 할 때 제네릭으로 변경하는 방법
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;

    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
    // 매개변수에 와일드카드 타입을 적용해 해결
    public void pushAll(Iterable<? extends E> src){
        for(E e : src)
            push(e);
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        // 와일드카드 타입을 이용하면 Number로 선언되어도 Integer를 넣을 수 있다.
        numberStack.pushAll(integers);
    }
}
