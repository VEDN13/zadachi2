import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Задача 1
//---------------------------------------------------------------------
    public static int task1(int a, int b)
    {
        if (a == b)
        {
            throw new IllegalArgumentException("Ошибка: значения равны.");
        }
        else
        {
            return Math.max(a, b);
        }
    }

//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        System.out.println("Введите значение b");
//        int b = in.nextInt();
//        in.close();
//        try
//        {
//            System.out.println(task1(a, b));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 2
//---------------------------------------------------------------------
    public static float task2(int a, int b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Ошибка: делитель равен нулю");
        }
        else
        {
            return (float)a / b;
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        System.out.println("Введите значение b");
//        int b = in.nextInt();
//        in.close();
//        try
//        {
//            System.out.println(task2(a, b));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

        //Задача 3
//---------------------------------------------------------------------
        public static String task3(String a)
        {
            try
            {
                int number = Integer.parseInt(a);
                return a + " является числом";
            }
            catch (NumberFormatException e)
            {
                throw new NumberFormatException("Ошибка: " + a + " не является числом");
            }
        }

//        public static void main(String[] args)
//        {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите строку");
//            String a = in.nextLine();
//            in.close();
//            try
//            {
//                System.out.println(task3(a));
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }
//---------------------------------------------------------------------

    //Задача 4
//---------------------------------------------------------------------
    public static String task4(int a)
    {
        if (0 < a & 150 > a)
        {
            return "Возраст принят";
        }
       else
       {
           throw new IllegalArgumentException("Ошибка: Возраст не может быть меньше нуля или более 150");
       }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите возраст");
//        int a = in.nextInt();
//        in.close();
//        try
//            {
//                System.out.println(task4(a));
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//    }
//---------------------------------------------------------------------

    //Задача 5
//---------------------------------------------------------------------
    public static double task5(int a)
    {
        if (0 < a)
        {
            return Math.sqrt(a);
        }
        else
        {
            throw new IllegalArgumentException("Число не может быть меньше нуля");
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = in.nextInt();
//        in.close();
//        try
//            {
//                System.out.println(task5(a));
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//    }
//---------------------------------------------------------------------

    //Задача 6
//---------------------------------------------------------------------
    public static int task6(int input)
    {
        if (input > 0)
        {
            int fak = 1;
            for (int i = input; i >= 1; i--)
            {
                fak *= i;
            }
            return fak;
        }
        else
        {
            throw new ArithmeticException();
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = in.nextInt();
//        in.close();
//        try
//            {
//                System.out.println(task6(a));
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//    }
//---------------------------------------------------------------------

    //Задача 7
//---------------------------------------------------------------------
    public static void task7(int[] array)
    {
        for (int num : array)
        {
            if (num == 0)
            {
                throw new IllegalArgumentException("В массиве есть нули");
            }
        }
        System.out.println("В массиве нет нулей");
    }

//    public static void main(String[] args)
//    {
//       // int[] Array = {1, 2, 3, 4};
//         int[] Array = {1, 0, 3, 4};
//        try
//        {
//            task7(Array);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

        //Задача 8
//---------------------------------------------------------------------
        public static double task8(int a, int b)
        {
         if (b > 0)
         {
             return Math.pow(a, b);
         }
         else
         {
             throw new IllegalArgumentException("Отрицательная степень");
         }
        }
//        public static void main(String[] args)
//        {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите число");
//            int a = in.nextInt();
//            System.out.println("Введите степень");
//            int b = in.nextInt();
//            in.close();
//            try
//            {
//                System.out.println(task8(a, b));
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }
//---------------------------------------------------------------------

    //Задача 9
//---------------------------------------------------------------------
    public static double task9(String a, int b)
    {
        if (b > a.length())
        {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }

        String trimmedString = a.substring(0, b);
        System.out.println("Обрезанная строка: " + trimmedString);
        return 0;
    }

//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String a = in.nextLine();
//        System.out.println("Введите число");
//        int b = in.nextInt();
//        in.close();
//        try
//        {
//            task9(a, b);
//
//        }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//
//    }
//---------------------------------------------------------------------

        //Задача 10
//---------------------------------------------------------------------
        public static void task10(int[] array, int a)
        {
            boolean found = false;

            for (int num : array)
            {
                if (num == a)
                {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new IllegalArgumentException("Ошибка: В массиве нет данного значения");
            }
            else
            {
                System.out.println("В массиве есть данное значение");
            }
        }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        in.close();
//        int[] myArray = {1, 0, 3, 4};
//        try
//        {
//            task10(myArray, a);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 11
//---------------------------------------------------------------------
    public static int task11(int a)
    {
        if (a < 0)
        {
            throw new IllegalArgumentException("Ошибка: Число не должно быть отрицательным");
        }
        else
        {
            System.out.println("Двоичное представление числа " + a + ": " + Integer.toBinaryString(a));
        }
        return 0;
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = in.nextInt();
//        try
//        {
//            task11(a);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 12
//---------------------------------------------------------------------
    public static boolean task12(int a, int b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Ошибка: деление на ноль");
        }
        return a % b == 0;
    }

//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число a:");
//        int a = in.nextInt();
//        System.out.println("Введите число b:");
//        int b = in.nextInt();
//        in.close();
//        try
//        {
//            if (task12(a, b))
//            {
//                System.out.println(a + " делится на " + b);
//            }
//            else
//            {
//                System.out.println(a + " не делится на " + b);
//            }
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 13
//---------------------------------------------------------------------
    public static <T> T task13(List<T> list, int index)
    {
        if (index < 0 || index >= list.size())
        {
            throw new IndexOutOfBoundsException("Ошибка: " + index + " выходит за пределы списка");
        }
        return list.get(index);
    }

//    public static void main(String[] args)
//    {
//        List<String> myList = List.of("Элемент 1", "Элемент 2", "Элемент 3");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите индекс:");
//        int a = in.nextInt();
//        try
//        {
//            System.out.println(task13(myList, a));
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 14
//---------------------------------------------------------------------
    public static int task14(String a)
    {

        if (8 > a.length())
        {
            throw new IllegalArgumentException("Ошибка: пароль не надёжный");
        }
        else
        {
            System.out.println("Пароль принят");
        }
        return 0;
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите пароль:");
//        String a = in.nextLine();
//        in.close();
//        try
//        {
//            task14(a);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------
    //Задача 16
//---------------------------------------------------------------------
    public static String task16(String a, String b)
    {
        if (a == null || a.trim().isEmpty() || b == null || b.trim().isEmpty())
        {
            throw new NullPointerException("Ошибка: одна из строк null");
        }
        else
        {
            return a + b;
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        String a = in.nextLine();
//        System.out.println("Введите значение b");
//        String b = in.nextLine();
//        in.close();
//        try
//        {
//            System.out.println(task16(a, b));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 17
//---------------------------------------------------------------------
    public static int task17(int a, int b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Ошибка: делитель равен нулю");
        }
        else
        {
            return a % b;
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        System.out.println("Введите значение b");
//        int b = in.nextInt();
//        in.close();
//        try
//        {
//            System.out.println(task17(a, b));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 18
//---------------------------------------------------------------------
    public static float task18(int a)
    {
        if (a < 0)
        {
            throw new IllegalArgumentException("Ошибка: Число отрицательное");
        }

        return (float) Math.sqrt(a);
    }
//        public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = in.nextInt();
//        in.close();
//        try
//        {
//            System.out.println(task18(a));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 19
//---------------------------------------------------------------------
    public static double task19(double celsius)
    {
        if (celsius < -273.15)
        {
            throw new IllegalArgumentException("Ошибка: Температура не может быть ниже абсолютного нуля");
        }

        return (celsius * 9 / 5) + 32;
    }

//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите температуру в Цельсиях:");
//        double a = in.nextDouble();
//        in.close();
//        try
//        {
//            System.out.println("Температура в Фаренгейтах: " + task19(a));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//---------------------------------------------------------------------

    //Задача 20
//---------------------------------------------------------------------
    public static int task20(String a)
    {
        if (a == null || a.trim().isEmpty())
        {
            throw new IllegalArgumentException("Ошибка: строка является пустой");
        }
        else
        {
            System.out.println("строка принята");
        }
        return 0;
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String a = in.nextLine();
//        in.close();
//        try
//        {
//            task20(a);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
    }
