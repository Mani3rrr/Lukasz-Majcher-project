package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.forum.*;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(5.0, "circle1");
        Square square = new Square(6.0, "square1");
        Triangle triangle = new Triangle(3.0, 5.0, "triangle1");

        //When
        ShapeCollector.addFigure(circle);
        ShapeCollector.addFigure(square);
        ShapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(3, ShapeCollector.getShapeQuantity());
    }

    @Test
     public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(5.0, "circle1");
        Square square = new Square(6.0, "square1");
        Triangle triangle = new Triangle(3.0, 5.0, "triangle1");
        ShapeCollector.addFigure(circle);
        ShapeCollector.addFigure(square);
        ShapeCollector.addFigure(triangle);


        //When
        boolean result = ShapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, ShapeCollector.getShapeQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(5.0, "circle1");
        Square square = new Square(6.0, "square1");
        Triangle triangle = new Triangle(3.0, 5.0, "triangle1");
        ShapeCollector.addFigure(circle);
        ShapeCollector.addFigure(square);
        ShapeCollector.addFigure(triangle);


        //When
        Shape test = ShapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(test.getShapeName(),"triangle1") ;
    }


}