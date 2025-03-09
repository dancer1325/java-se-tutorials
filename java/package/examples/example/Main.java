package example;

import graphics.Circle;
import humanBeing.*;
//import humanBeing.W*;         // NOT allowed patterns importing

// `import static`
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        // 1.  refer package's member | ANOTHER package -- via -- package member's fully qualified name
        graphics.Rectangle rectangle = new graphics.Rectangle();

        // 2.  -- import the -- package member
        Circle circle = new Circle();

        // 3.  -- import the -- WHOLE package
        Woman woman = new Woman();
        Man man = new Man();

        // 4.   name ambiguity (spotshape's Rectangle & graphics' Rectangle)      -> REQUIRED to use FULLY qualified name
        spotshape.Rectangle rectangle1 = new spotshape.Rectangle();

        // 5. import static
        // 5.1 use it
        System.out.println("PI " + PI);
        // 5.2 alternative -- via -- member's fully qualified name
        double r = Math.cos(Math.PI);       // Math.cos()       ==  member's fully qualified name
    }
}