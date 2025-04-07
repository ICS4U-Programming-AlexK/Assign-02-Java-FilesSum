import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
/**
 * The program will read information from a file
 * then it will try to convert it into string and
 * then split the string into an array of integers.
 *
 * @author Alex Kapajika
 * @version 1.0
 * @since 2025-03-06
 */
public final class FileSum {
    /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private FileSum() {
        throw new IllegalStateException("Utility Class");
    }
    static int sumNumbers(final ArrayList<Integer> numberList) {
        int sum = 0;
        for (int counter = 0; counter < numberList.size(); counter++) {
            sum += numberList.get(counter);
        }
        return sum;
    }
    /**
     * Main Method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) throws Exception {
        FileWriter inputFile = new FileWriter("input.txt");
        FileWriter outputFile = new FileWriter("output.txt");
        ArrayList<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        for (int counter = 0; counter < 100; counter++) {
            int randomNumber = random.nextInt(100);
            numberList.add(randomNumber);
            inputFile.write(randomNumber + "\n");
        }
        inputFile.close();
        outputFile.write("The sum of all number is: "
         + sumNumbers(numberList) + "\n");
        outputFile.close();
     }
}
