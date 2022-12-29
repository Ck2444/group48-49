package HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        // 2.1 Создайте строку через new - I study Basic Java!;
        String textnumber1 = new String("I study Basic Java");

        // 2.2 Напишите метод, который принимает в качестве параметра строку,
        // передайте в этот метод строку, которую создали в п.1
        printText(textnumber1);

    }

    public static void printText(String text) {
        System.out.println("===============2.2==============");
        System.out.println("2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1");

        System.out.println(text);
        //2.3 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println("===============2.3==============");
        System.out.println(text.charAt(17));

        //2.4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("===============2.4==============");

        String testString1 = "Java";

        boolean resultContains = text.contains(testString1);
        System.out.println(resultContains);

        // Заменить все символы “а” на “о”.
        System.out.println("===============2.5==============");
        String oldString = "I study Basic Java";
        String newString =  oldString.replace('a','o' );
        System.out.println(newString);

        // Преобразуйте строку к верхнему регистру./ Преобразуйте строку к нижнему регистру.
        System.out.println("===============2.6/2.7==============");
        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        // Вырезать строку Java c помощью метода String.substring().
        System.out.println("===============2.8==============");
        System.out.println(text.substring(14,18));
    }

    }
