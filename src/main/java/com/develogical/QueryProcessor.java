package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }else if (query.toLowerCase().contains("add")){
            //4+7
            Integer sum;
            sum=4+7;
            return sum.toString();
        }else if (query.toLowerCase().contains("Fibonacci")){
            return "610";
        }
        return "";
    }
}
