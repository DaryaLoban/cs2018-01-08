package by.it.kalabuhova.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");

        }
    };

    static double averageAge(Dog[] dogs) {
        double res = 0.0;
        if (dogs.length > 0) {
            for (Dog dog : dogs) {
                res = res + 1.0 * dog.getAge();
                            }
            res = res / dogs.length;
        }
        return res;
    }
}