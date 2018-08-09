package com.mTrepka.dataGen;

import java.util.ArrayList;
import java.util.List;

public class DataFactories {
    public static NameFactory getNameFactory(){
        NameFactory nameFactory = new NameFactory();
        nameFactory.withData(defaultNameData());
        return nameFactory;
    }
    private static List<String> defaultNameData(){
        List<String> defaultData = new ArrayList<String>();
        defaultData.add("Jacob");
        defaultData.add("Michael");
        defaultData.add("Joshua");
        defaultData.add("Matthew");
        defaultData.add("Christopher");
        defaultData.add("Andrew");
        defaultData.add("Daniel");
        defaultData.add("Ethan");
        defaultData.add("Sophia");
        defaultData.add("Olivia");
        defaultData.add("Emma");
        defaultData.add("Ava");
        defaultData.add("Isabella");
        defaultData.add("Mia");
        defaultData.add("Aria");
        defaultData.add("Riley");
        return defaultData;
    }
}
