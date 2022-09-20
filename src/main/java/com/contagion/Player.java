package com.contagion;

public class Player {
    static private int id;
    private String name;

    public String getName() {
        return name;
    }

    public Player() {
        ++id;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Unnamed player";
        } else {
            this.name = name;
        }
    }

    public int getId() {
        return id;
    }
}
