package chapter2.item2;

// 점층적 생성자 패턴
// 매개변수 개수가 많아지면 클라이언트 코드를 작성하거나 읽기 어렵다.
public class Telescoping {
    public static void main(String[] args) {
        NutritionFacts1 n = new NutritionFacts1(240, 8, 100, 0, 35, 27);
    }
}

class NutritionFacts1{
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts1(int servingSize, int servings){
        this(servingSize, servings, 0);
    }
    public NutritionFacts1(int servingSize, int servings, int calories){
        this(servingSize, servings, calories, 0);
    }
    public NutritionFacts1(int servingSize, int servings, int calories, int fat){
        this(servingSize, servings, calories, fat, 0);
    }
    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium){
        this(servingSize, servings, calories, fat, sodium, 0);
    }
    public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}