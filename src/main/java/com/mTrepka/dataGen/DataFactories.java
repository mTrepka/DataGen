package com.mTrepka.dataGen;

import java.util.ArrayList;
import java.util.List;

public class DataFactories {
    public static NameFactory getNameFactory() {
        var nameFactory = new NameFactory();
        nameFactory.withData(defaultNameData());
        return nameFactory;
    }
    public static NameFactory getNameFactoryWithData(List<String> data){
        var nameFactory = new NameFactory();
        nameFactory.withData(data);
        return nameFactory;
    }
    public static AdressFactory getAdressFactory(){
        var adressFactoryFactory = new AdressFactory();
        adressFactoryFactory.setCityData(defaultCityData());
        adressFactoryFactory.setStreetData(defaultStreetData());
        return adressFactoryFactory;
    }

    public static ArrayList to(int first,int last){
        if(first>last) {
            throw new ArrayIndexOutOfBoundsException();
        }
        var array = new ArrayList<>();
        var i =0;
        while(last>=first){
            array.add(first);
            i++;
            first++;
        }
        return array;
    }

    public static ArrayList to(int toNumber){
        var array = new ArrayList<>();
        var i =0;
        while(toNumber>=i){
            array.add(i);
            i++;
        }
        return array;
    }

    private static List<String> defaultNameData(){
        var defaultData = new ArrayList<String>();
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
    private static List<String> defaultCityData(){
        var defaultData = new ArrayList<String>();
        defaultData.add("Warszawa");
        defaultData.add("Krakow");
        defaultData.add("Wroclaw");
        defaultData.add("Bialystok");
        defaultData.add("Gdynia");
        defaultData.add("Zakopane");
        defaultData.add("Katowice");
        defaultData.add("Gdansk");
        defaultData.add("Olsztyn");
        defaultData.add("Lublin");
        defaultData.add("Rzeszow");
        defaultData.add("Kielce");
        defaultData.add("Opole");
        defaultData.add("Zielona Gora");
        defaultData.add("Bydgoszcz");
        defaultData.add("Torun");
        defaultData.add("Poznan");
        defaultData.add("Szczecin");
        return defaultData;
    }

    private static List<String> defaultStreetData(){
        List<String> defaultData = new ArrayList<>();
        defaultData.add("Long");
        defaultData.add("Short");
        defaultData.add("White");
        defaultData.add("Black");
        defaultData.add("Yellow");
        defaultData.add("Hill");
        return defaultData;
    }
}
