package chapter6.item37;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];

        for (int i = 0; i < plantsByLifeCycle.length ; i++)
            plantsByLifeCycle[i] = new HashSet<>();

        for (Plant plant : garden)
            plantsByLifeCycle[plant.lifeCycle.ordinal()].add(plant);

        for (int i = 0; i < plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
        }
    }
}
