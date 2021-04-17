/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Six;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Triangle extends GeometricObject {
    private int s1;
    private int s2;
    private int s3;
    private String color;
    private boolean isFill;

    public Triangle(int s1, int s2, int s3, String color, boolean isFill) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.color = color;
        this.isFill = isFill;
    }
    
    @Override
    public double perimeter(){
        return s1+s2+s3;
    }
    @Override
    public double area(){
        double p = perimeter();
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }
    public boolean isFill(){
        return  isFill;
    }
    
    @Override
    public String toString() {
        return "Area is "
                + Math.round(this.area() * 100) / 100.0
                + "\nPerimeter is " + this.perimeter()
                + "\nThe Triangle is "
                + (isFill ? "Filled" : "Not Filled ")
                + "\nTriangle Color is " + color;
    }

}
