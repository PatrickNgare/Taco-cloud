package com.patel.tacocloud;

public class Indegredient {
    private final String id;
    private final String name;
    private final Type type;

    public Indegredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public enum Type{

    WRAP,PROTEIN,VEGGIES, CHEESE,SAUSE
}


}
