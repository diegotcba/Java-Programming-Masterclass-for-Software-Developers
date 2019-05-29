/**
 * Created by DiegoT on 29/05/2019.
 */
public class TeenNumberChecker {
    public static boolean hasTeen(int firstAge, int secondAge, int thirAge) {
        return (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirAge));
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <=19);
    }
}
