package zad4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        Optional<Uczen> s = journal.zwrocUcznia1("123");
        if(s.isPresent()){
            Uczen wypakowany = s.get();
            System.out.println(wypakowany);
        }
        Uczen uczen = journal.zwrocUcznia2_zle("123");
        if(uczen !=null){
            System.out.println(uczen.getImie());
        }
        try {
            Uczen uczen_2 = journal.zwrocUcznia2("123");
            //jesli kod dotarl w to miejsce znaczy ze student istnieje
            System.out.println(uczen_2);
        } catch (UczenNotFoundException e){
            System.out.println("blad, brak studenta");
        }
    }

}
