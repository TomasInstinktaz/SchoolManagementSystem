package com.vcs.mvn.main;

import com.vcs.mvn.collections.Keys;
import com.vcs.mvn.collections.Maps;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Maps m = new Maps();
        // 1
        m.addToMap(new Keys(1, 1, 1), 2);
        m.addToMap(new Keys(1, 2, 1), 3);
        m.addToMap(new Keys(1, 3, 2), 5);
        // 2
        m.addToMap(new Keys(2, 4, 2), 10);
        // 1
        m.addToMap(new Keys(1, 5, 3), 10);


        // Ispausdinam mokinio 1 paz knygele
        m.mapOut(m.extractPazimiuKnygele(1));

        // Ispausdinam mokinio 2 paz knygele
        m.mapOut(m.extractPazimiuKnygele(2));
    }
}
