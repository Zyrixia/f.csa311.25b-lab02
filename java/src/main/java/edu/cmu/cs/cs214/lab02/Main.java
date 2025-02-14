package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(8);
        Shape circle = new Circle(5);

        Renderer rectRenderer = new Renderer(rectangle);
        Renderer circRenderer = new Renderer(circle);
        Renderer sqrRenderer = new Renderer(square);

        rectRenderer.draw();
        circRenderer.draw();
        sqrRenderer.draw();
    }
}
