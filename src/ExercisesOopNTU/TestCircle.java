package ExercisesOopNTU;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class TestCircle {

    public static void main (String [] args){
        Circle c = new Circle();
        c.getRadius();
       // c.setRadius();
        c.getArea();

        System.out.println("Referente ao construtor default: \n" + c.getRadius() + "\n" + c.getArea() + "\n");

        Circle c1 = new Circle(2.78);
        c1.getRadius();
        c1.getArea();

        System.out.println("Referente ao primeiro construtor: \n" + c1.getRadius() + "\n" + c1.getArea() + "\n");

        Circle c2 = new Circle(2.0, "blue");
        c2.getRadius();
        c2.getColor();

        System.out.println("Referente ao segundo construtor: \n" + c2.getRadius() + "\n" + c2.getColor()+ "\n");

        //
        System.out.println("Referente ao método toString: \n" + c.toString()+ "\n");
        System.out.println("Referente ao método toString: \n" + c1.toString()+ "\n");
        System.out.println("Referente ao método toString: \n" + c2.toString());

    }


}
