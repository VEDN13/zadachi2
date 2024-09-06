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
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        System.out.println("Введите значение b");
//        int b = in.nextInt();
//        System.out.println(task1(a, b));
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
            return a / b;
        }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите значение a");
//        int a = in.nextInt();
//        System.out.println("Введите значение b");
//        int b = in.nextInt();
//        System.out.println(task2(a, b));
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
            } catch (NumberFormatException e)
            {
                throw new NumberFormatException(a + " не является числом");
            }
        }

//        public static void main(String[] args)
//        {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите строку");
//            String a = in.nextLine();
//            System.out.println(task3(a));
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
           throw new IllegalArgumentException("Возраст не может быть меньше нуля или более 150");
       }
    }
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите возраст");
//        int a = in.nextInt();
//        System.out.println(task4(a));
//    }
//---------------------------------------------------------------------

    //Задача 5
//---------------------------------------------------------------------
    public static String task5(int a)
    {
        if (0 < a & 150 > a)
        {
            return "Возраст принят";
        }
        else
        {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля или более 150");
        }
    }
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите возраст");
    int a = in.nextInt();
    System.out.println(task5(a));


//        5. Нахождение корня
//        Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
//
//        6. Факториал
//        Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
//
//        7. Проверка массива на нули
//        Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
//
//        8. Калькулятор возведения в степень
//        Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
//
//        9. Обрезка строки
//        Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
//
//        10. Поиск элемента в массиве
//        Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
//
//        11. Конвертация в двоичную систему
//        Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
//
//        12. Проверка делимости
//        Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.
//
//        13. Чтение элемента списка
//        Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
//
//        14. Парольная проверка
//        Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.
//
//        15. Проверка даты
//        Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.
//
//        16. Конкатенация строк
//        Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
//
//        17. Остаток от деления
//        Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.
//
//        18. Квадратный корень
//        Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.
//
//        19. Конвертер температуры
//        Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.
//
//        20. Проверка строки на пустоту
//        Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.

    }
}