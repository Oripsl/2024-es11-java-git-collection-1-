import java.util.*;

public class DataHelper {
    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(11));
        }
        return list;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max + 1));
        }
        return list;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max + 1 - min) + min);
        }
        return list;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
     public static Set<Integer> getRandomUniqueInteger(int size) {
         Random random = new Random();
         Set<Integer> set = new HashSet<>();

         while (set.size() < size) {
             set.add(random.nextInt(11));
         }

         return set;
     }

     // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
     public static Set<Integer> getRandomUniqueInteger(int size, int max) {

        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while (set.size() < size) {
            set.add(random.nextInt(max + 1));
        }

        return set;
     }

     // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
//     max
     public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {

            Random random = new Random();

            Set<Integer> set = new HashSet<>();

            while (set.size() < size) {
                set.add(random.nextInt(max + 1) - min);
            }

            return set;
        }


    // restituisce una mappa di frequenza di numeri interi
     public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
     }
}
