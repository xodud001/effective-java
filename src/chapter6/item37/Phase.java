package chapter6.item37;

public enum Phase {
    SOLID,
    LIQUID,
    GAS;

    public enum Transition{
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                {null, MELT, SUBLIME},
                { FREEZE, null, BOIL},
                { DEPOSIT, CONDENSE, null}
        };

        public static Transition from(Phase from, Phase to){
            //배열들의 인덱스에 ordinal()을 사용했다.
            // 컴파일러가 ordinal과 배열 인덱스의 관계를 알 수 없으므로 위험하다.
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }
    }
}
