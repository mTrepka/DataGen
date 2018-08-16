package com.mTrepka.dataGen;

import java.util.*;

public class AdressFactory extends DataFactory{
    private int streetNumber =100;
    private String country = "Poland";
    private String postalAdressSeparator = "-";
    private List<String> cityData;
    private List<String> streetData;
    public List<HashMap> generateData(int amount){
        var result = new ArrayList<HashMap>();
        Random random;
        if(seed!=0)
            random = new Random(seed);
        else
            random = new Random();

        while(amount>0){
            amount--;
            var res = new HashMap<>();
            res.put("street",streetData.get(random.nextInt(streetData.size())));
            res.put("city",cityData.get(random.nextInt(cityData.size())));
            res.put("country",country);
            res.put("streetNumber",random.nextInt(streetNumber));
            res.put("postalNumber",random.nextInt(99)+postalAdressSeparator+random.nextInt(999));
            result.add(res);
        }
        return result;
    }
    AdressFactory setStreetNumber(int streetNumber){
        this.streetNumber = streetNumber;
        return this;
    }
    AdressFactory setpostalAdressSeparator(String postalAdressSeparator){
        this.postalAdressSeparator = postalAdressSeparator;
        return this;
    }
    AdressFactory setCountry(String country){
        this.country = country;
        return this;
    }

    AdressFactory setCityData(List<String> cityData){
        this.cityData = cityData;
        return this;
    }

    AdressFactory setStreetData(List<String> streetData){
        this.streetData = streetData;
        return this;
    }
    public HashMap<String, Object> getSingle(){
        Random random = new Random();
        var result = new HashMap<String,Object>();
        result.put("street",streetData.get(random.nextInt(streetData.size())));
        result.put("city",cityData.get(random.nextInt(cityData.size())));
        result.put("country",country);
        result.put("streetNumber",random.nextInt(streetNumber));
        result.put("postalNumber",random.nextInt(99)+postalAdressSeparator+random.nextInt(999));
        return result;
    }
}
