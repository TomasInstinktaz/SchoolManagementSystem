package com.vcs.mvn.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    // Skirta paieskoms su mokiniu: "gauti pazimiu knygele"
    private Map<String, Integer> zurnalasMknMktDna = new HashMap<>();

    // Skirta paieskoma su datomis: "gauti pazymius uz laikotarpi / pagal mokini /
    // ir pagal dalyka"
    private Map<String, Integer> zurnalasDnaMknMkt = new HashMap<>();

    public void mapOut(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        System.out.println("Pazimiu knygele:");
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

    }

    public void addToMap(Keys k, int pazimys) {
        zurnalasMknMktDna.put(k.keyMknMktDna(), pazimys);
        zurnalasDnaMknMkt.put(k.keyDnaMknMkt(), pazimys);
    }

    public Map<String, Integer> extractPazimiuKnygele(int mokinysId) {

        String mokId = "" + mokinysId + "_";

        Set<String> keys = zurnalasMknMktDna.keySet();

        Map<String, Integer> result = new HashMap<>();
        for (String key : keys) {
            if (key.startsWith(mokId)) {
                result.put(key, zurnalasMknMktDna.get(key));
            }
        }

        return result;
    }
}
