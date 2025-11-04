package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner, ArrayList<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    public void add (Valuable asset){
        assets.add(asset);
    }
    public double getValue() {
        //loop through the valuable in arrayList assets
        double total = 0;
        for (Valuable valuable: assets) {
            total += valuable.getValue();
        }
        //add everything up keeping a total
        //return the total

        return 0;

    }
}
