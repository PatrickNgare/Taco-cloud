package com.patel.tacocloud;

import lombok.Data;

@Data
public class Indegredient {
    private final String id;
    private final String name;
    private final Type type;


    public enum Type{

    WRAP,PROTEIN,VEGGIES, CHEESE,SAUSE
}


}
