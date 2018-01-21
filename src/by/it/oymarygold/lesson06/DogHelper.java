package by.it.oymarygold.lesson06;

import by.it.oymarygold.lesson06.Dog;

public class DogHelper {

    static void printAllNames(by.it.oymarygold.lesson06.Dog[] dogs) {
        for (by.it.oymarygold.lesson06.Dog dog : dogs) {
            System.out.print(dog.getName()+" ");
        }
        System.out.println();
    }

    static double averageAge(by.it.oymarygold.lesson06.Dog[] dogs) {
        double res = 0;
        if (dogs.length > 0)
            for (Dog dog : dogs)
                res = res + 1.0*dog.getAge()/dogs.length;
        return res;
    }


}