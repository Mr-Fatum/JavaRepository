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
            try {
                byteInput = scanner.nextByte();
            } catch (Exception egnored) {
            }
            try {
                shortInput = scanner.nextShort();
            } catch (Exception egnored) {
            }
            try {
                integerInput = scanner.nextInt();
            } catch (Exception egnored) {
            }
            try {
                longInput = scanner.nextLong();
            } catch (Exception egnored) {
            }
            try {
                floatInput = scanner.nextFloat();
            } catch (Exception egnored) {
            }
            try {
                doubleInput = scanner.nextDouble();
            } catch (Exception egnored) {
            }
            
        }
        switch (a) {
            case 1:
                String s1 = String.format(Integer.toBinaryString(byteInput & 0xFF));
                System.out.println(s1);
                break;
            case 2:
                String s2 = String.format(Integer.toBinaryString(shortInput & 0xFF));
                System.out.println(s2);
                break;
            case 3:
                String s3 = Integer.toBinaryString(integerInput);
                System.out.println(s3);
                break;
            case 4:
                String s4 = String.format(Long.toBinaryString(longInput & 0xFF));
                System.out.println(s4);
                break;
            case 5:
                int str = Float.floatToIntBits(floatInput);
                String s5 = Integer.toBinaryString(str);
                System.out.println(s5);
                break;
            case 6:
                String s6 = String.format(Long.toBinaryString(Double.doubleToRawLongBits(doubleInput)));
                System.out.println(s6);
                break;
            default:
                System.out.println("Ошибка, перезапустите код и введите число в выбранном типе данных");
                break;
        }
    }
}
