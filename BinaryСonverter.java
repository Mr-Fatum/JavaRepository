import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BinaryСonverter {
    private static byte byteInput;
    private static short shortInput;
    private static int integerInput;
    private static long longInput;
    private static float floatInput;
    private static double doubleInput;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Выберите вид переменной, которую надо перевести в бинарную систему счисления");
        System.out.println("Если надо перевести из типа byte введите \"1\"");
        System.out.println("Если надо перевести из типа short введите \"2\"");
        System.out.println("Если надо перевести из типа int введите \"3\"");
        System.out.println("Если надо перевести из типа long введите \"4\"");
        System.out.println("Если надо перевести из типа float введите \"5\"");
        System.out.println("Если надо перевести из типа double введите \"6\"");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Введите число в формате byte");
                byteInput = scanner.nextByte();
                break;
            case 2:
                System.out.println("Введите число в выбранном формате short");
                shortInput = scanner.nextShort();
                break;
            case 3:
                System.out.println("Введите число в выбранном формате int");
                integerInput = scanner.nextInt();
                break;
            case 4:
                System.out.println("Введите число в выбранном формате long");
                longInput = scanner.nextLong();
                break;
            case 5:
                System.out.println("Введите число в выбранном формате float");
                floatInput = scanner.nextFloat();
                break;
            case 6:
                System.out.println("Введите число в выбранном формате double");
                doubleInput = scanner.nextDouble();
                break;
            default:
                System.out.println("Ошибка, перезапустите программу и введите одно из указанных чисел");
                break;
        }
        try {
            byteInput = scanner.nextByte();
            shortInput = scanner.nextShort();
            integerInput = scanner.nextInt();
            longInput = scanner.nextLong();
            floatInput = scanner.nextFloat();
            doubleInput = scanner.nextDouble();
        } catch (InputMismatchException IME) {
            System.out.println(IME.getMessage() + "Something went wrong");
        }   
        switch (a) {
            case 1:
                String byteString = String.format(Integer.toBinaryString(byteInput & 0xFF));
                System.out.println(byteString);
                break;
            case 2:
                String shortString = String.format(Integer.toBinaryString(shortInput & 0xFF));
                System.out.println(shortString);
                break;
            case 3:
                String integerString = Integer.toBinaryString(integerInput);
                System.out.println(integerString);
                break;
            case 4:
                String longString = String.format(Long.toBinaryString(longInput & 0xFF));
                System.out.println(longString);
                break;
            case 5:
                int str = Float.floatToIntBits(floatInput);
                String floatString = Integer.toBinaryString(str);
                System.out.println(floatString);
                break;
            case 6:
                String doubleString = String.format(Long.toBinaryString(Double.doubleToRawLongBits(doubleInput)));
                System.out.println(doubleString);
                break;
            default:
                System.out.println("Ошибка, перезапустите код и введите число в выбранном типе данных");
                break;
        }
    }
}
