package homework.task_1;

import java.util.Scanner;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */
public class InfoJobTitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter work position ID from 1 to 3");
        int number = scanner.nextInt();
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        switch (number) {
            case 1:
                director.infoJobTitle();
                break;
            case 2:
                worker.infoJobTitle();
                break;
            case 3:
                accountant.infoJobTitle();
                break;
            default:
                System.out.println("Invalid position ID");
                break;
        }
    }
}
