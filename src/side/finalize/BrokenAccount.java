package side.finalize;

public class BrokenAccount extends Account {

    public BrokenAccount(String name) {
        super(name);
    }

    @Override
    protected void finalize() throws Throwable {
        this.transfer(10000, "김태영");
    }
}
