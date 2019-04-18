package com.company;

public class Time {
    private int houre;
    private int minute;
    private int second;
    public void setTime(int h,int m,int s){
        houre= h;
        minute=m;
        second = s;
    }
    public void desplaytime(){
        System.out.printf("%dH:%02dm:%02ds",houre,minute,second);
    }

}
