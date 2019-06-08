package zad4;

import java.util.ArrayList;
import java.util.List;

public class Uczen {
    private String imie;
    private String nazwisko;
    private String indeks;
    private List<Double> listaOcen = new ArrayList<>();

    public Uczen(String imie, String nazwisko, String indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;

    }
    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;

    }

}


