package Lab.Lab5;

import java.util.Scanner;

/**
 * This program demonstrates static methods
 */
public class Geometry {

    /**
     * prints out some instruction of menu
     *
     * <p>this will simply
     * print out instructions for the user with a menu of options for the user to choose,
     * no return ,no param</p>
     */
    public static void printMenu() {
        System.out.println("This is a geometry calculator \n" +
                "Choose what you would like to calculate \n" +
                "1. Find the area of a circle \n" +
                "2. Find the area of a rectangle \n" +
                "3. Find the area of a triangle \n" +
                "4. Find the circumference of a circle \n" +
                "5. Find the perimeter of a rectangle \n" +
                "6. Find the perimeter of a triangle \n" +
                "Enter the number of your choice:");
    }

    /**
     * calculates this Area of this circle
     *
     * <p>uses this formula Math.PI*radius*radius calculate the area of the circle</p>
     *
     * @param radius needs to be a double ,and radius should  0 (greater than 0 zero)
     * @return Area of this circle,a double value of circle area,should greater than 0 zero
     */
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * calculates and returns the Area of the rectangle .
     *
     * <p>uses the length (double) multiply the width
     * and get the result of the area of the rectangle</p>
     *
     * @param length needs to be a double ,and radius  (greater than the zero)
     * @param width  needs to be a double ,and radius  (greater than the zero)
     * @return a double value of rectangle area.should greater than 0
     */
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * calculate  area of the triangle .
     *
     * <p>uses this formula A = ½bh,
     * b means base of this triangle ,h means height of this triangle.</p>
     *
     * @param base   needs to be a double ,and base  (greater than the zero)
     * @param height needs to be a double ,and  height  (greater than the zero)
     * @return area of the triangle ,needs to be a double ,
     * and  height  (greater than the zero)
     */
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * calculates this Circumference of this circle
     *
     * <p>uses radius multiply 2 multiply Math.PI , formula is 2*Math.PI*radius</p>
     *
     * @param radius needs to be a double ,and  radius  (greater than the zero)
     * @return Circumference of this circle,
     * needs to be a double ,and radius  (greater than the zero)
     */
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * calculate Perimeter of this rectangle .
     *
     * <p>this formula is :2*(length + width), length is the length of this rectangle ,width is same</p>
     *
     * @param length needs to be a double ,and  length  (greater than the zero)
     * @param width  needs to be a double ,and width  (greater than the zero)
     * @return Perimeter of this rectangle ,double
     * needs to be a double ,and width  (greater than the zero)
     */
    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    /**
     * calculate Perimeter of this triangle
     *
     * <p>formula is :{@code perimeter = side1 + side2 + side3},each of sides is tne triangle side</p>
     *
     * @param side1 needs to be a double ,and side  (greater than the zero)
     * @param side2 needs to be a double ,and side  (greater than the zero)
     * @param side3 needs to be a double ,and side  (greater than the zero)
     * @return Perimeter of this triangle ,double,should greater than 0
     * needs to be a double ,and side  (greater than the zero)
     */
    public static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        int choice; //the user's choice
        double value = 0; //the value returned from the method
        char letter; //the Y or N from the user's decision to exit
        double radius; //the radius of the circle
        double length; //the length of the rectangle
        double width; //the width of the rectangle
        double height; //the height of the triangle
        double base; //the base of the triangle
        double side1; //the first side of the triangle
        double side2; //the second side of the triangle
        double side3; //the third side of the triangle

        //create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //do loop was chose to allow the menu to be displayed first
        do {

            //Task#1 3. call the printMenu() method
            printMenu();
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    radius = keyboard.nextDouble();
                    //call the circleArea method and store the result in the value
                    value = circleArea(radius);
                    //format String.format("%.2f", value)
                    System.out.println("The area of the circle is " + String.format("%.2f", value));
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    width = keyboard.nextDouble();
                    //call the rectangleArea method and store the result in the value
                    value = rectangleArea(length, width);
                    System.out.println("The area of the rectangle is " + String.format("%.2f", value));
                    break;
                case 3:
                    System.out.print("Enter the height of the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of the triangle: ");
                    base = keyboard.nextDouble();
                    //call the triangleArea method and store the result in the value
                    value = triangleArea(base, height);
                    System.out.println("The area of the triangle is " + String.format("%.2f", value));
                    break;
                case 4:
                    System.out.print("Enter the radius of the circle: ");
                    radius = keyboard.nextDouble();
                    //call the circumference method and store the result in the value
                    value = circleCircumference(radius);
                    System.out.println("The circumference of the circle is " + String.format("%.2f", value));
                    break;
                case 5:
                    System.out.print("Enter the length of the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    width = keyboard.nextDouble();
                    //call the perimeter method and store the result in the value
                    value = rectanglePerimeter(length, width);
                    System.out.println("The perimeter of the rectangle is " + String.format("%.2f", value));
                    break;
                case 6:
                    System.out.print("Enter the length of side 1 of the triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of side 2 of the triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of side 3 of the triangle: ");
                    side3 = keyboard.nextDouble();
                    //call the perimeter method and store the result in the value
                    value = trianglePerimeter(side1, side2, side3);
                    System.out.println("The perimeter of the triangle is " + String.format("%.2f", value));
                    break;
                default:
                    System.out.println("You did not enter a valid choice.");
            }

            //consumes the new line character after the number
            keyboard.nextLine();
            System.out.println("Do you want to exit the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        } while (letter != 'Y' && letter != 'y');
    }
}
