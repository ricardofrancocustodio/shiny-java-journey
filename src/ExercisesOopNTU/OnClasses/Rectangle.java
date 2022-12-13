package ExercisesOopNTU.OnClasses;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){

    }

    //overloaded constructor
    public Rectangle(float length, float width){
        this.length = getLength();
        this.width  = getWidth();

    }

    public float getLength(){
        return length;
    }

    public void setLength(float le){
        this.length = le;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float wi){
        this.width = wi;
    }

    public double getArea(){
        return width * length; //base x altura
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }


    public String toString(){
        return "Rectangle[length=" + length + ", wicth=" + width + "]";
    }



}
