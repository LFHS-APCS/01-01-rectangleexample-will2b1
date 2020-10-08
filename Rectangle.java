/**
 * Rectangle class - this class will control a rectangle
 * @author Mr. Aronson
 */
public class Rectangle
{
    // "instance" variables are variables that every object of that class will have
    //  int --> integer like -1, 0, 1, 2, ...
    //  double --> decimal like 4.3 or -6.75
    private int x; // this is the x coordinate with (0,0) on lower left
    private int y; // this is the y coordinate (see above)
    private int width;  // width of the rectangle (in x direction)
    private int height;  // height of the rectangle (in y direction)

    /**
     * default constructor for Rectangle  
     * this constructor automatically get called when you 
     *      make a "new" object of type Rectangle.
     * defaults to a width and height of 5 at (0,0)
     */
    public Rectangle()
    {
        x = 0;  
        y = 0;
        width = 5;
        height = 5;
    }

    /**
     * another constructor for Rectangle that takes parameter
     *     variables to initialize the rectangle
     *     parameters are communication from another program to this object
     */
    public Rectangle(int theX, int theY, int theWidth, int theHeight)
    {
        this.x = theX;  
        this.y = theY;
        this.width = theWidth;
        height = theHeight;  // you do not need to say "this",  but it is still there
    }

    /**
     * gets the x-coordinate (this is an "accessor" method meaning 
     *              it returns the value of a variable in the object)
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * gets the y-coordinate (another "accessor" method)
     */
    public int getY()
    {

    }

    /**
     * sets the value of x (this is a "mutator" method which changes 
     *                          the value of a variable in the object)
     * theX is an example of a parameter variable which is communication 
     *                          from the outside world to this object
     */
    public void setX(int theX)
    {
        this.x = theX;
    }

    /**
     * sets the value of y (another "mutator" method with a parameter)
     */
    public void setY(int theY)
    {

    }

    /**
     * move the rectangle the given rightX and upY values.  
     * Negative numbers would move down to the left.
     */
    public void move(int rightX, int upY)
    {
        x = x + rightX;

    }

    /**
     * toString - returns info about the rectangle
     * We will be looking at Strings in more detail later.
     * Right now, notice the fact that the letters in quotes will be printed exactly
     * and the variables will be replaced with their values.
     */
    public String toString()
    {
        return "x: " + x + " y: " + y + " width: " + width + " height: " + height;
    }
}
