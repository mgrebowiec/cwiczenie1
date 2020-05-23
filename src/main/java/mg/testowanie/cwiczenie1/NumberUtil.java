package mg.testowanie.cwiczenie1;

public class NumberUtil {
    // Do sprawdzenia przypadki:
    // - a dowolne, b = 0
    // - a dowlone, b != 0
    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }

        return a / b;
    }

    // Do sprawdzenia przypadki:
    // - numbers jest pustą tablicą, min dowolne
    // - numbers ma wartość null, min dowolne
    // - numbers zawiera liczby, min dowolne
    public static int[] getNumbersGreaterThan(int[] numbers, int min) {
        int size = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                size++;
            }
        }

        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                result[index] = numbers[i];
                index ++;
            }
        }

        return result;
    }

    // Do sprawdzenia przypadki:
    // - sampleTable jest pustą tablicą
    // - sampleTable ma wartość null
    // - sampleTable zawiera liczby
    public static int[] getEvenNumbers(int[] sampleTable) {
        int size = 0;
        for (int i = 0; i < sampleTable.length; i++) {
            if (sampleTable[i] % 2 == 0) {
                size++;
            }
        }

        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < sampleTable.length; i++) {
            if (sampleTable[i] % 2 == 0) {
                result[index] = sampleTable[i];
                index ++;
            }
        }

        return result;
    }
}
