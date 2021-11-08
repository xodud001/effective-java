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

    public void pushAll(Iterable<E> src){
        for(E e : src)
            push(e);
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        // 매개변수화 타입은 불공변이기 때문에
        // Integer가 Number의 하위 타입이더라도
        // List<Integer>는 List<Number>의 하위 타입이 아니다.
        // 때문에 List<Number>에 Integer 타입을 넣을 수 없다
        numberStack.pushAll(integers);
    }
}
