package chapter4.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccessAuthority {

    private static final String[] PRIVATE_VALUES = {"ONE", "TWO", "THREE"};

    public static final String[] values(){
        return PRIVATE_VALUES.clone();
    }
}
