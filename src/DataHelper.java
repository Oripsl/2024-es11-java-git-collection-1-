import java.util.*;

public class DataHelper {
    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {
        checkSizeNonNegative(size);

        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size + 1));
        }
        return list;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {
        checkSizeNonNegative(size);
        checkMaxNonNegative(max);

        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max + 1));
        }
        return list;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        checkSizeNonNegative(size);
        checkMinLessThanOrEqualMax(min, max);
        checkSizeNotExceedRange(size, max - min + 1);

        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max - min + 1) + min);
        }
        return list;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static Set<Integer> getRandomUniqueInteger(int size) {
        checkSizeNonNegative(size);

        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while (set.size() < size) {
            set.add(random.nextInt(size + 1));
        }

        return set;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static Set<Integer> getRandomUniqueInteger(int size, int max) {
        checkSizeNonNegative(size);
        checkMaxNonNegative(max);

        if (size < (max + 1)) {
            throw new IllegalArgumentException("Il numero di elementi richiesti e' piu grande di quanti ce ne entrino");

        }

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
        checkSizeNonNegative(size);
        checkMinLessThanOrEqualMax(min, max);
        checkSizeNotExceedRange(size, max - min + 1);

        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while (set.size() < size) {
            set.add(random.nextInt(max - min + 1) + min);
        }

        return set;
    }


    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("La lista non puo essere nulla o vuota");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }

    private static void checkSizeNonNegative(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("La dimensione non può essere negativa.");
        }
    }

    private static void checkMaxNonNegative(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("Il valore massimo non può essere negativo.");
        }
    }

    private static void checkMinLessThanOrEqualMax(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Il numero minimo non può essere maggiore del massimo.");
        }
    }

    private static void checkSizeNotExceedRange(int size, int range) {
        if (size > range) {
            throw new IllegalArgumentException("Il numero di elementi richiesti è maggiore degli elementi unici disponibili nell'intervallo.");
        }
    }
}
