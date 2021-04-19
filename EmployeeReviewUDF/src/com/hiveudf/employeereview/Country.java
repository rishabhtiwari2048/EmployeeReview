package com.hiveudf.employeereview;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Country extends UDF {

    public String evaluate(String location){
        if (location.trim().equalsIgnoreCase("none"))
        {
            return("none");
        }
        else
        {
            if (location.contains("(") && location.contains(")"))
            {
                return(location.substring(location.indexOf("(")+1,location.indexOf(")")));
            }
            else
            {
                return("USA");
            }
        }
    }
}