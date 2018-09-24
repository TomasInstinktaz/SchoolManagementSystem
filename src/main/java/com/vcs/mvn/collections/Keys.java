package com.vcs.mvn.collections;

public class Keys {
    private static final String SEP = "_";

    private Integer mokinysId;
    private Integer mokytojoId;
    private Integer diena;

    public Keys(Integer mokinysId, Integer mokytojoId, Integer diena) {
        this.mokinysId = mokinysId;
        this.mokytojoId = mokytojoId;
        this.diena = diena;
    }

    public String keyMknMktDna() {
        return "" + mokinysId + SEP + mokytojoId + SEP + diena;
    }

    public String keyDnaMknMkt() {
        return "" + diena + SEP + mokinysId + SEP + mokytojoId;
    }

    public Integer getMokinysId() {
        return mokinysId;
    }

    public Integer getMokytojoId() {
        return mokytojoId;
    }

    public Integer getDiena() {
        return diena;
    }
}
