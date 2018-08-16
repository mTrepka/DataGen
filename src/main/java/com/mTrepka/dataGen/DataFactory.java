package com.mTrepka.dataGen;

import java.util.HashMap;
import java.util.List;

public abstract class DataFactory<T> {
    List<Object> data;
    long seed;
    public abstract List<T> generateData(int amount);
    public abstract Object getSingle();
    public DataFactory withSeed(String seed){
        this.seed = seed.hashCode();
        return this;
    }
    public DataFactory withSeed(long seed){
        this.seed = seed;
        return this;
    }

}
