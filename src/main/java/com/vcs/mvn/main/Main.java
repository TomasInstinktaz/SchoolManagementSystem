package com.vcs.mvn.main;

import com.vcs.mvn.collections.Keys;
import com.vcs.mvn.collections.Maps;
import com.vcs.mvn.persons.Student;
import com.vcs.mvn.persons.Teacher;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Maps m = new Maps();
        // 1
//        m.addToMap(new Keys(1, 1, 1), 2);
//        m.addToMap(new Keys(1, 2, 1), 3);
//        m.addToMap(new Keys(1, 3, 2), 5);
//        // 2
//        m.addToMap(new Keys(2, 4, 2), 10);
//        // 1
//        m.addToMap(new Keys(1, 5, 3), 10);


        m.addToMap(new Keys(new Student(1,"Simas", "Sitanavicius", 10).getId(), new Teacher(1,"Antanas", "Antanavicius", 40, "Matematika").getId(), 1), 2);
        m.addToMap(new Keys(new Student(1,"Simas", "Sitanavicius", 10).getId(), new Teacher(2,"Simas", "Simaitis", 32, "Matematika").getId(), 1), 3);
        m.addToMap(new Keys(new Student(1,"Simas", "Sitanavicius", 10).getId(), new Teacher(3,"Arturas", "Artuinas", 40, "Fizika").getId(), 2), 5);
        // 2
        m.addToMap(new Keys(new Student(2,"Simas", "Binaitis", 11).getId(), new Teacher(4,"Inga", "Inaviciene", 35, "Lietuviu").getId(), 2), 10);
        // 1
        m.addToMap(new Keys(new Student(1,"Simas", "Sitanavicius", 10).getId(), new Teacher(5,"Loreta", "Loreviciene", 30, "Anglu").getId(), 3), 10);



        // Ispausdinam mokinio 1 paz knygele
        m.mapOut(m.extractPazimiuKnygele(new Student(1,"Simas", "Sitanavicius", 10).getId()));

        // Ispausdinam mokinio 2 paz knygele
        m.mapOut(m.extractPazimiuKnygele(new Student(2,"Simas", "Binaitis", 11).getId()));
    }
}
