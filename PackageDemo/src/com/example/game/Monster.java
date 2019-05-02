package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hiPoints;
    private int strength;

    public Monster(String name, int hiPoints, int strength) {
        this.name = name;
        this.hiPoints = hiPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHiPoints() {
        return hiPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hiPoints=" + hiPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hiPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hiPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
