package com.hiveudf.employeereview;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.Date;

public class DateExtract extends UDF{

    public String evaluate(String posting_date) {
        if (!posting_date.equalsIgnoreCase("none")) {
            String[] date_parts;
            date_parts = posting_date.trim().split("; ");
            System.out.println(date_parts[0]);
            System.out.println(date_parts[1]);
            String month = date_parts[0].split(" ")[0];
            System.out.println(month);
            String day = date_parts[0].split(" ")[1];
            System.out.println(day);
            String month_number = "00";
            switch (month) {
                case "Jan":
                    month_number = "01";
                    break;
                case "Feb":
                    month_number = "02";
                    break;
                case "Mar":
                    month_number = "03";
                    break;
                case "Apr":
                    month_number = "04";
                    break;
                case "May":
                    month_number = "05";
                    break;
                case "Jun":
                    month_number = "06";
                    break;
                case "Jul":
                    month_number = "07";
                    break;
                case "Aug":
                    month_number = "08";
                    break;
                case "Sep":
                    month_number = "09";
                    break;
                case "Oct":
                    month_number = "10";
                    break;
                case "Nov":
                    month_number = "11";
                    break;
                case "Dec":
                    month_number = "12";
                    break;
            }
            return(date_parts[1] + "-" + month_number + "-" + day);
        } else {
            return("None");
        }
    }

    }


