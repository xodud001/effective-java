package chapter2.item2;

// 빌더 패턴
// 빌더 패턴은 명명된 선택적 매개변수(named optional parameters)를 흉내 낸 것
// 점층적 생성자 패턴의 안정성과 자바빈즈 패턴의 가독성을 겸비한 패턴
// 빌더의 세터 메서드들은 빌더 자신을 반환하기 때문에 연쇄적으로 호출 할 수 있다.
// 이런 방식을 메서드 호출이 흐르듯 연결된다는 뜻으로 플루언트 API(fluent API) 혹은 메서드 연쇄(method chaining)라 한다.
public class Builder {
    public static void main(String[] args) {
        NutritionFacts3 coke = new NutritionFacts3.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
class NutritionFacts3{
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val; return this;
        }
        public Builder fat(int val){
            fat = val; return this;
        }
        public Builder sodium(int val){
            sodium = val; return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }

        public NutritionFacts3 build(){
            return new NutritionFacts3(this);
        }
    }
    private NutritionFacts3(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}