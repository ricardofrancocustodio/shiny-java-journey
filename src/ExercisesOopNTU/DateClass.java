package ExercisesOopNTU;

public class DateClass {

    private int day;
    private int month;
    private int year;

    public DateClass(int day, int month, int year){
        this.day        = day;
        this.month      = month;
        this.year       = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int d){
        this.day = d;
    }

    public void setMonth(int m){
        this.month = m;
    }

    public void setYear(int y){
        this.year = y;
    }

    public void setDate(int day, int month, int year){
        this.day        = day;
        this.month      = month;
        this.year       = year;
    }

    public String toString(){
        return "Date[day="+ getDay() +" month="+ getMonth() +" year="+ getYear() + "]";
    }
}
