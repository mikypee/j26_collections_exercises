package zad3;

import java.util.ArrayList;
import java.util.List;



public class zad3{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("123","Pawel", "Gawel", Gender.MALE));
        students.add(new Student("234","Michal", "Pierz", Gender.MALE));
        students.add(new Student("423","Piotr", "Romaks", Gender.MALE));
        students.add(new Student("523","Roman", "Sterling", Gender.MALE));
        students.add(new Student("623","Kasia", "Iskra",Gender.FEMALE));
        students.add(new Student("723","Ada", "Bol",Gender.FEMALE));
        students.add(new Student("443","Natalia", "Gil",Gender.FEMALE));
        students.add(new Student("333","Paula", "Gawela",Gender.FEMALE));
        students.add(new Student("223","Pawel", "Bawel",Gender.MALE));
        System.out.println(students.get(0));
        System.out.println(students);




        }


        }




