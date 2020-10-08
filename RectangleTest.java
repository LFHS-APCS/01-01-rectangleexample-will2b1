import org.junit.*;

/**
 * Tests my Rectangle class
 */
public class RectangleTest extends junit.framework.TestCase {

    public static void main(String[] args) {
      RectangleTest test = new RectangleTest();
      test.test_rectangle();
    }

    @Test
    public void test_rectangle() {
        Rectangle rect = new Rectangle();
        
        assertEquals(rect.getX(), 0);
        assertEquals(rect.getY(), 0);
        System.out.println("The rectangle x is at " + rect.getX());
        System.out.println("The rectangle y is at " + rect.getY());
        
        // Change the x
        rect.setX(10);
        assertEquals(rect.getX(), 10);
        System.out.println("The rectangle x is at " + rect.getX());
        
        //Change the y
        rect.setY(20);
        assertEquals(rect.getY(), 20);
        System.out.println("The rectangle y is at " + rect.getY());
        
        // Move the rectangle
        rect.move(5, 4);
        assertEquals(rect.getX(), 15);
        assertEquals(rect.getY(), 24);
        
        System.out.println(rect.toString());
    }
}