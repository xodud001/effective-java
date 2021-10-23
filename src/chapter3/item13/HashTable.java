package chapter3.item13;

public class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[10];
    private int SIZE = 0;
    private static class Entry{
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }


    }

    public void put(Object key, Object value){
        buckets[SIZE++] = new Entry(key, value, null);
    }

    @Override
    public HashTable clone() {
        try{
            HashTable result = (HashTable)super.clone();
            result.buckets = new Entry[buckets.length];

            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        // HashTable의 clone을 호출하면
        // HashTable 내의 buckets는 복제가 되었지만 buckets에 담겨있는 Entry가 복제되지 않아서 문제가 생김
        HashTable h1 = new HashTable();
        h1.put("key", "value");
        HashTable h2 = h1.clone();
    }
}
