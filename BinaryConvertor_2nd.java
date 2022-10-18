import java.util.Locale;
import java.util.Scanner;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class BinaryConvertor_2nd {
    private static final String[] typeArray = {"byte", "short", "int", "long", "float", "double"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Выберите вид переменной, которую надо перевести в бинарную систему счисления");
        for (int i = 0; i < typeArray.length; i++) {
            System.out.println("Если надо перевести из типа " + typeArray[i] + " введите " + (i + 1));
        }
        try {
            int a = scanner.nextInt();
            if (a < 1 && a > 6) {
                System.out.println("Ошибка, перезапустите программу и введите одно из указанных чисел");
                return;
            }
            System.out.println("Введите число в выбранном формате " + typeArray[a - 1]);
            if (a < 5) {
                long longInput = scanner.nextLong();
            } else {
                double doubleInput = scanner.nextDouble();
                System.out.println("Результат: " + String.format(Long.toBinaryString(Double.doubleToRawLongBits(doubleInput))));
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println(inputMismatchException);
        } catch (IllegalFormatException illegalFormatException) {
            System.out.println(illegalFormatException);
        }
    }
}