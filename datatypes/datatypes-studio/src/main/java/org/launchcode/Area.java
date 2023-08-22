package org.launchcode;
import java.util.Scanner;
import studios.areaofacircle.Circle;
public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("Please enter number greater than 0:");
            radius = input.nextDouble();
        }
        System.out.println("The area of a circle of radius "  + radius + " is: " + Circle.getArea(radius));
    }
}
