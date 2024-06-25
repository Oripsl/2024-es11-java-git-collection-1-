import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        testRandomInteger();
        System.out.println("//////////////////////////////////////");
        testRandomUniqueInteger();
        System.out.println("//////////////////////////////////////");
        testFrequencyMap();
    }

    public static void testRandomInteger() {
        List<Integer> soloSize = DataHelper.getRandomInteger(10);
        System.out.println(soloSize);
        List<Integer> sizeAndMax = DataHelper.getRandomInteger(10, 20);
        System.out.println(sizeAndMax);
        List<Integer> sizeMinAndMax = DataHelper.getRandomInteger(10, 10, 11);
        System.out.println(sizeMinAndMax);
    }

    public static void testRandomUniqueInteger() {
        Set<Integer> soloSize = DataHelper.getRandomUniqueInteger(10);
        System.out.println(soloSize);
        Set<Integer> sizeAndMax = DataHelper.getRandomUniqueInteger(10, 20);
        System.out.println(sizeAndMax);
        Set<Integer> sizeMinAndMax = DataHelper.getRandomUniqueInteger(5, 10, 20);
        System.out.println(sizeMinAndMax);
    }

    public static void testFrequencyMap() {
        List<Integer> soloSize = DataHelper.getRandomInteger(20);
        Map<Integer, Integer> res = DataHelper.getFrequencyMap(soloSize);
        System.out.println(res);

        List<Integer> sizeAndMax = DataHelper.getRandomInteger(12, 200);
        Map<Integer, Integer> res1 = DataHelper.getFrequencyMap(sizeAndMax);
        System.out.println(res1);


    }


}
