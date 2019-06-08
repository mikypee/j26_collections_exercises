import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainGwiazdka {
        public static void main(String[] args) {

        Random random =new Random();

            int wylosowana = random.nextInt();

        Scanner scanner = new Scanner(System.in);

            System.out.println("podaj ilosc liczb wpisywanych:");
        int liczbyWpisane = scanner.nextInt();

            System.out.println("podaj ilosc liczb wygenerowanych:");

            int liczbyWygenerowane = scanner.nextInt();



            List<Integer> list = new ArrayList();
            while (liczbyWpisane-- > 0) {
                System.out.println("podaj liczby:");
                int liczbaZaladowana = scanner.nextInt();
                list.add(liczbaZaladowana);
            }
            while (liczbyWygenerowane-- > 0){
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
