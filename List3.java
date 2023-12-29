package ArrayList;
import java.util.ArrayList;


public class List3 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.33);
        expenses.add(290.32);
        expenses.add(420.03);

        System.out.println("Сейчас в списке: ");
        for (Double trata : expenses){
            System.out.println("Трата на сумму " + trata + " руб.");
        }
    }
}
