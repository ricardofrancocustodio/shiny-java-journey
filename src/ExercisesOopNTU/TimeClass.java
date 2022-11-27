package ExercisesOopNTU;

import java.sql.Time;

public class TimeClass {

    private int hour;
    private int minute;
    private int second;

    public TimeClass(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int h){
        this.hour = h;
    }

    public void setMinute(int m){
        this.minute = m;
    }

    public void setSecond(int s){
        this.second = s;
    }

    public int previousSecond(int second){
        this.second = second - 1;
        return this.second;
    }

    public int nextSecond(int second){
        this.second = second + 1;
        return this.second;
    }

    public String toString(){
        return "Time[hour="+ getHour() +" minute=" + getMinute() + " second="+ getSecond() +"]" ;
    }
}
