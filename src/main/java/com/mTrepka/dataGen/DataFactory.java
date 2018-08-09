package com.mTrepka.dataGen;

import java.util.HashMap;
import java.util.List;

public abstract class DataFactory<T> {
    protected List<Object> data;
    protected long seed;
    public abstract List<T> generateData(int amount);
    public DataFactory withSeed(String seed){
        this.seed = seed.hashCode();
        return this;
    }
    public DataFactory withSeed(long seed){
        this.seed = seed;
        return this;
    }
}
