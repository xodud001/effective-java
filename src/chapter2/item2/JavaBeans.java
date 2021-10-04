package chapter2.item2;

// 자바빈즈 패턴
// 점층적 생성자 패턴의 단점은 보완됨. 하지만 코드가 길어짐.
// 인스턴스를 만드는건 쉬워짐. 읽기 쉬운 코드가 되긴 함
// 하지만 객체 하나를 만들려면 메서드를 여러 개 호출해야 하고,
// 객체가 완전히 생성되기 전까지는 일관성(consistency)이 무너진 상태에 놓이게 된다.
// 자바빈즈 패턴에서는 클래스를 불변으로 만들 수 없다
// 이런 단점을 보완하고자 수동으로 freezing해 사용못하도록 할 수 있다. 하지만 이 방법은 다루기가 어려워 실전에서 안 쓰임

public class JavaBeans {
    public static void main(String[] args) {
        NutritionFacts2 coke = new NutritionFacts2();
        coke.setServingSize(240);
        coke.setServings(8);
        coke.setCalories(100);
        coke.setSodium(35);
        coke.setCarbohydrate(27);
    }
}
class NutritionFacts2{
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}