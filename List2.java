package ArrayList;
import java.util.ArrayList;


public class List2 {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(92.3);
        temperatures.add(12.4);
        temperatures.add(74.1);
        temperatures.add(45.0);

        double max = 0;
        for (int i = 0; i < temperatures.size(); i++){
            if(temperatures.get(i) > max){
                max = temperatures.get(i);
            }
        }
        System.out.println("Самая высокая температура: " + max + " •c.");
    }
}
