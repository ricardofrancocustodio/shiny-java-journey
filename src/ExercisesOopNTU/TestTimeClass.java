package ExercisesOopNTU;

public class TestTimeClass {

    public static void main(String[] args) {
        TimeClass time = new TimeClass(1,1,59);
        time.setHour(3);
        //time.nextSecond(time.getSecond());
        time.previousSecond(time.getSecond());
        time.previousSecond(time.getSecond());
        time.nextSecond(time.getSecond());
        time.setMinute(2);

        System.out.println(time);

    }
}
