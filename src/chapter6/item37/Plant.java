package chapter6.item37;

import java.lang.reflect.ParameterizedType;
import java.util.*;

public class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle){
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("김동영", LifeCycle.ANNUAL));
        garden.add(new Plant("김똥영", LifeCycle.ANNUAL));
        garden.add(new Plant("김동팔", LifeCycle.ANNUAL));
        garden.add(new Plant("김똥팔", LifeCycle.BIENNIAL));
        garden.add(new Plant("김동구녕", LifeCycle.ANNUAL));
        garden.add(new Plant("김똥꼬", LifeCycle.PERENNIAL));
        garden.add(new Plant("김동고", LifeCycle.PERENNIAL));
        garden.add(new Plant("동반꿀", LifeCycle.ANNUAL));

        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for (LifeCycle lc : LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());

        for (Plant plant : garden)
            plantsByLifeCycle.get(plant.lifeCycle).add(plant);

        System.out.println(plantsByLifeCycle);
    }
}
