package by.it.morozevich.lesson06;

public class DogHelper {

    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName()+" ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogs) {
        double res = 0;
        if (dogs.length > 0)
            for (Dog dog : dogs)
                res = res + 1.0*dog.getAge()/dogs.length;
        return res;
    }


}
