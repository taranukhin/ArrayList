package ArrayList;
import java.util.ArrayList;

public class removeElement {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.23);
        expenses.add(290.32);
        expenses.add(420.03);

        expenses.remove(120.23);

        System.out.println(expenses);

        expenses.remove(1);

        System.out.println(expenses);
        System.out.println("Элементов в списке: " + expenses.size());

        expenses.clear();

        System.out.println("Элементов в спичке: " + expenses.size());

        if (expenses.isEmpty()){
            System.out.println("нет сохраненных трат.");
        }else {
            System.out.println("Трат в списке - " + expenses.size());
        }

        boolean isExp = expenses.contains(290.32);
        if (isExp == false){
            expenses.add(0,290.32);
            System.out.println("трата " + expenses.get(0) + " рублей добавлена!");
        }else {
            System.out.println("Все расходы учтены");
        }


    }
}
