package ExercisesOopNTU.OnClasses;

public class TestRectangle {

    public static void main (String [] args){
        Rectangle rt1       = new Rectangle();
        Rectangle rt2       = new Rectangle();

        rt1.setLength(2.0f);
        rt1.setWidth(4.0f);

        rt2.setLength(4.0f);
        rt2.setWidth(8.0f);

        System.out.println("1º "+ rt1.toString());
        System.out.println("2º "+ rt2.toString() + '\n');

        System.out.println("Area 1 is: " + rt1.getArea());
        System.out.println("Area 2 is: " + rt2.getArea() + '\n');

        System.out.println("Perimeter 1 is: " + rt1.getPerimeter());
        System.out.println("Perimeter 2 is: " + rt2.getPerimeter());



    }
}
