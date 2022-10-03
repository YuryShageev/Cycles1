public class Main {
    public static void main(String[] args) {

        //Пример
        System.out.println("Example");
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        //Задача 1
        System.out.println("Task 1");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " годы являются високосными");
        }

        //Задача 2
        System.out.println("Task 2");
        for (int digit = 7; digit <= 98; digit = digit + 7) {
            System.out.println(digit);
        }

        //Задача 3
        System.out.println("Task 3");
        for (int multiplication = 1; multiplication <= 512; multiplication = multiplication * 2) {
            System.out.println(multiplication);
        }
    }
}