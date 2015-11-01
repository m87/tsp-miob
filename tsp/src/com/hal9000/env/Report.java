package com.hal9000.env;

import com.hal9000.data.TSPInstance;
import com.hal9000.solver.Solution;

import java.util.Map;
import java.util.TreeMap;

public class Report{
    public Map<String, Map<Integer, Map.Entry<TSPInstance, Solution>>> solutions;

    public Report(){
        solutions = new TreeMap<>();
    }



    public void dump(OutputFormatter outputFormatter){
    }

}

