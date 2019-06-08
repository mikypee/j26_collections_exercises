package zad4;

import zad3.Student;

import java.util.*;

public class Journal {
    private Map<String, Uczen> uczenMap = new HashMap<>();

    public void dodajUcznia(Uczen uczen) {
        uczenMap.put(uczen.getIndeks(), uczen);
    }

    public void usunUcznia(Uczen uczen) {
        uczenMap.remove(uczen.getIndeks());

    }

    //opcja 2 rzuc exception
    public Optional<Uczen> zwrocUcznia1(String indeks) {
        if (uczenMap.containsKey(indeks)) {
            return Optional.ofNullable(uczenMap.get(indeks));
        }
        return Optional.empty();
    }

    public Uczen zwrocUcznia2(String indeks) throws UczenNotFoundException {
        if (uczenMap.containsKey(indeks)) {
            return uczenMap.get(indeks);
        }
        throw new UczenNotFoundException("No student ");
    }

    public Uczen zwrocUcznia2_zle(String indeks) {
        if (uczenMap.containsKey(indeks)) {
            return uczenMap.get(indeks);
        }
        return null;
    }

    public double podajSrednia(String indeks) throws UczenNotFoundException {
        double sum = 0.0;

        Uczen uczenKtoregoSredniaLiczymy = zwrocUcznia2(indeks);
        for (Double ocena : uczenKtoregoSredniaLiczymy.getListaOcen()) {
            sum += ocena;

        }
        return sum / uczenKtoregoSredniaLiczymy.getListaOcen().size();
    }

    public List<Uczen> zwrocZagrozonych() {
        List<Uczen> listaWynikowa = new ArrayList<>();
        //magia
        Set<String> kopiaIndeksow = new HashSet<>(uczenMap.keySet());
    for (String indeks : kopiaIndeksow) {
        try {
            if (podajSrednia(indeks) <= 2.0) {
                listaWynikowa.add(uczenMap.get(indeks));
            }
        } catch (UczenNotFoundException e) {
            System.out.println("Błąd, nie można było odnaleźć studenta.");
        }
    }

        return listaWynikowa;
}

    public List<Uczen> zwrocPosortowanaListeUczniow() {
        List<Uczen> uczenList = new ArrayList<>(uczenMap.values());

        uczenList.sort(new Comparator<Uczen>() {
            @Override
            public int compare(Uczen o1, Uczen o2) {
                // zwrocisz 1 to o1 > 02
                // 0 - ==
                // -1 - o1 < o2
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());

                return Integer.compare(indeks1, indeks2);

            }
        });
        return uczenList;

    }}