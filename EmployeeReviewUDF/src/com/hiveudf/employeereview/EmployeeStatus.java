package com.hiveudf.employeereview;

import org.apache.hadoop.hive.ql.exec.UDF;

public class EmployeeStatus extends UDF{

    public String evaluate(String job_title, int option){

        String[] job_title_parts = job_title.split("-");
        if(option==1)
        {
            return(job_title_parts[0].trim());
        }
        if(option==2)
        {
            return(job_title_parts[1].trim());
        }
        return("None");

    }
}
