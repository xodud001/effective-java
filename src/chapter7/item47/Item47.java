package chapter7.item47;

public class Item47 {

    public static void main(String[] args) {
        // 자바 타입 추론의 한계로 컴파일 되지 않음
        for (ProcessHandle ph : ProcessHandle.allProcesses()::iterator){

        }
    }
}
