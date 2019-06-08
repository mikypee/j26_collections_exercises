package zad4;

public class Uczen {
    private String imie;
    private String nazwisko;
    private String indeks;
    private String oceny;

    public Uczen(String imie, String nazwisko, String indeks, String oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.oceny = oceny;
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
    public void setOceny(String oceny) {
        this.oceny = oceny;
    }
    public String getOceny() {
        return oceny;
    }

}


