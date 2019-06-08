import java.sql.SQLOutput;
import java.util.*;

public class Main {
        public static void main(String[] args) {

        Random random =new Random();

            int wylosowana = random.nextInt();

        Scanner scanner = new Scanner(System.in);

            List<Integer> list = new ArrayList();
            for (int i = 0; i <5; i++) {
                System.out.println("podaj liczby:");
                int liczbaZaladowana = scanner.nextInt();
                list.add(liczbaZaladowana);
            }
            for (int i = 0; i <5; i++){
                int liczbaZaladowana = random.nextInt(1000);
                list.add(liczbaZaladowana);
            }
            System.out.println(list);
            double suma = 0;
            for (Integer elementListy : list) {
                suma += elementListy;
            }

            System.out.println("Suma: " + suma );
            System.out.println("Srednia wszystkich elementow to :" + (suma/list.size()));

    }
}
