package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        double[] expenses = new double[10];//обьявлен массив из 10 элементов
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Serj");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        studentNames.add(1, s);
        studentNames.add("Max");
        studentNames.add("Lena");
        studentNames.add("Natasha");
        studentNames.add("Marina");
        studentNames.add("Kira");
        System.out.println(studentNames.size());//вывод размера списка в сообветсвии с его полнотой

        expenses[0] = 100;
        expenses[1] = 110;
        System.out.println(expenses.length); //водод размера массива не зависимо от его полноты


        ArrayList<Double> expanses = new ArrayList<>();
        expanses.add(120.45);
        expanses.add(290.12);
        expanses.add(350.05);
        System.out.println("Сейчас в списке: ");
        for(int i = 0; i < expanses.size(); i++){
            System.out.println("Трата " + i + ": " + expanses.get(i) + " руб.");
        }

    }
}
