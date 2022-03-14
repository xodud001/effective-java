package chapter7.item47;

public class Item47 {

    public static void main(String[] args) {
        // 동작하지만 안 좋은 우회방법
        for (ProcessHandle ph : (Iterable<ProcessHandle>)ProcessHandle.allProcesses()::iterator){

        }
    }
}
