package side.finalize;

public class Account {

    private String name;

    public Account(String name){
        this.name = name;
        if (this.name.equals("푸틴")) {
            throw new IllegalArgumentException("생성 실패");
        }
    }

    public void transfer(int amount, String to){
        System.out.printf("transfer %d from %s to %s", amount, name, to);
    }
}
