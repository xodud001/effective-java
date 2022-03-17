package side.finalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void 일반_사람(){
        Account account = new Account("김태영");
        account.transfer(1000, "동영");
    }
    @Test
    void 푸틴() throws InterruptedException {
        Account account = null;
        try{
            account = new BrokenAccount("푸틴");
        } catch(Exception exception){
            System.out.println("푸틴은 안되는데?");
        }

        System.gc();
        Thread.sleep(3000);
    }


}