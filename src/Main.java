import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        Random random = new Random();
        String[][] StringArray = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                StringArray[i][j] = String.valueOf(random.nextInt(50));
            }
        }

        try {
            result = sumArray(StringArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        for (String[] str : StringArray) {
            System.out.println(Arrays.toString(str));
        }
        System.out.println("Сумма всех элементов " + result);
    }


    private static int sumArray(String[][] StringArray) {
        int sum = 0;
        if (StringArray.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < StringArray.length; i++) {
            if (StringArray[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < StringArray.length; j++) {
                try {
                    sum += Integer.parseInt(StringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }
}




