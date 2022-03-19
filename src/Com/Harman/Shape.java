/*We have to calculate the area of a rectangle, a square and a circle.
        Create an abstract class 'Shape' with three abstract methods
        namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea'
        taking one parameter each. The parameters of 'RectangleArea' are its length
        and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its
        radius. Now create another class 'Area' containing all the three methods
        'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle,
        square and circle respectively.Create an object of class 'Area' and call all the three methods.
*/
package Com.Harman;

abstract class Shape {

    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(double radius);

}
class Area extends Shape{
    void RectangleArea(int length,int breadth){
        int Area = length*breadth;
        System.out.println("Area of Rectangle:" +Area);

    }
    void SquareArea(int side){
        int Area = side * side;
        System.out.println("Area of Square:" +Area);
    }
    void CircleArea(double radius){
        double Area = (radius * radius)*3.14;
        System.out.println("Area of circle:"+Area);
    }

}
class Main{
    public static void main(String[] args) {
        Area a =new Area();
        a.RectangleArea(4,5);
        a.SquareArea(5);
        a.CircleArea(3);

    }
}


