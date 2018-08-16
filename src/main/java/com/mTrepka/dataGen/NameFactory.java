package com.mTrepka.dataGen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class NameFactory extends DataFactory {
    public List<String> generateData(int amount){
        var result = new ArrayList<String>();
        Random random;

            if(seed!=0)
                random = new Random(seed);
            else
                random = new Random();
            while (amount>0){
                   result.add((String) data.get(random.nextInt(data.size())));
                   amount--;}
        return result;
    }
    public NameFactory withData(List<String> data){
        this.data = data;
        return this;
    }

    public String getSingle(){
        var random = new Random();
        return (String) data.get(random.nextInt(data.size()));
    }
}
