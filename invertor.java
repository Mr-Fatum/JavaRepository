import java.util.Locale;
import java.util.Scanner;

public class invertor {
    private static byte b1;
    private static short sh1;
    private static int i1;
    private static long l1;
    private static float f1;
    private static double d1;

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
                b1 = scanner.nextByte();
                break;
            case 2:
                System.out.println("Введите число в выбранном формате short");
                sh1 = scanner.nextShort();
                break;
            case 3:
                System.out.println("Введите число в выбранном формате int");
                i1 = scanner.nextInt();
                break;
            case 4:
                System.out.println("Введите число в выбранном формате long");
                l1 = scanner.nextLong();
                break;
            case 5:
                System.out.println("Введите число в выбранном формате float");
                f1 = scanner.nextFloat();
                break;
            case 6:
                System.out.println("Введите число в выбранном формате double");
                d1 = scanner.nextDouble();
                break;
            default:
                System.out.println("Ошибка, перезапустите программу и введите одно из указанных чисел");
                break;
        }
        switch (a) {
            case 1:
                String s1 = String.format(Integer.toBinaryString(b1 & 0xFF));
                System.out.println(s1);
                break;
            case 2:
                String s2 = String.format(Integer.toBinaryString(sh1 & 0xFF));
                System.out.println(s2);
                break;
            case 3:
                String s3 = Integer.toBinaryString(i1);
                System.out.println(s3);
                break;
            case 4:
                String s4 = String.format(Long.toBinaryString(l1 & 0xFF));
                System.out.println(s4);
                break;
            case 5:
                int str = Float.floatToIntBits(f1);
                String s5 = Integer.toBinaryString(str);
                System.out.println(s5);
                break;
            case 6:
                String s6 = String.format(Long.toBinaryString(Double.doubleToRawLongBits(d1)));
                System.out.println(s6);
                break;
            default:

                break;
        }
    }
}
