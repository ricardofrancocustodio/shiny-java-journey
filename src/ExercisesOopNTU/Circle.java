package ExercisesOopNTU;

import java.util.Scanner;

public class Circle {
    private double radius;
    private  String color;

    //Circle Default with no arguments
    public Circle(){
        this.radius = 1.0;
        color = "red";
    }

    //First Circle -  overloaded - with one argument
    public Circle(double rd){
        this.radius = rd;
        color = "blue";
    }

    //Second Circle - overloaded -  with two arguments
    public Circle(double rad, String col){
        this.radius = rad;
        color = col;
    }

    public double getArea(){
        // calc radius² * π (pi)
        return Math.PI * radius * radius;
    }


    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    //returns a description of the instance (in the return type of String)
    public String toString(){
        return "Circle[radius = " + radius + " - color = " + color +" ]";
       // return "<some string>" + radius;
    }


}
