package HomeWork2;

public class Task3_Pizzza {
    public static void main(String[] args) {
        /*
        Напишите программу, которая вычисляет, сколько лишних калорий будет,
        если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
        Чтобы решить эту проблему, предположим,
        что каждый квадратный сантиметр пиццы содержит 40 калорий.
         */
        int caloriesOneCentimetr = 40;

        double calories24 = getSquarePizzza(24);
        double calories28 = getSquarePizzza(28);

        System.out.println("More calories in pizza 48cm than 24 cm: " + (calories28 - calories24)*caloriesOneCentimetr
                + " calories");




    }

    private static double getSquarePizzza(double diameter) {
        return diameter * diameter / 4 * Math.PI;}
}
