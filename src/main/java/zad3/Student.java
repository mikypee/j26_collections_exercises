package zad3;

public class Student {
    private String indeks;
    private String name;
    private String surname;
    private Gender gender;

    public Student(String indeks, String name, String surname, Gender gender) {
        this.indeks = indeks;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
//alt + insert "toString()   zamiast hashcode wypisuje w wyswietlony ponizej sposob
    @Override
    public String toString() {
        return "Student{" +
                "indeks='" + indeks + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}


