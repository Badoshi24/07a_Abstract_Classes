package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0,10.0);



        // das geht jetzt nicht mehr.... abstraktion
        //Shape shape = new Shape();
            
        output("------ Flächen ------"); 
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());

        
      

  output("------  Differenzen ------");
        output("Diff. r-t :" + areaDiff(rectangle, triangle));

    output("Diff. c-r: " + areaDiff(circle,rectangle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));




       }

       
      private static double areaDiff(Shape s1, Shape s2)
       {

      return s1.area() -s2.area();
   
      }
   







    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

