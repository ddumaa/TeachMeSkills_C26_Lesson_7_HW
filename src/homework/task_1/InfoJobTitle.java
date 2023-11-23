package homework.task_1;

import java.util.Scanner;

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
