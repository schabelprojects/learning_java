public class Übung12 {
    
    public static void main(String[] args) {
        double radius = 7.5;
        double pi = Math.PI;
        
        // Calculate area of circle
        double area = pi * radius * radius;
        System.out.println("Area of circle with radius " + radius + " = " + area);
        
        // Calculate perimeter of circle
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle with radius " + radius + " = " + perimeter);
    }
}
