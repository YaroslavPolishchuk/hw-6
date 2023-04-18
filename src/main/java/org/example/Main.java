package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "Alissandritto";
        var toOut = uniqueChars(str);

        toOut.values().forEach(System.out::println);
    }

    public static Map<Integer,Character> uniqueChars(String str){
        char[] ch_arr=str.toCharArray();
        Map<Integer,Character> unique = new HashMap<>();

        for(int i=0;i<ch_arr.length;i++) {
            for(int x=0;x<ch_arr.length;x++)
                if(i!=x){
                    if(ch_arr[i]!=ch_arr[x]){
                        if(!unique.containsValue(ch_arr[i])){
                            unique.put(i,ch_arr[i]);
                        }
                    }
                }
        }
        return unique;
    }
}