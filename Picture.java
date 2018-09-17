/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @student author Michal Legocki
 * @version 2018.09.17
 * 
 * creates an image of an archer shooting at a target
 */
public class Picture
{
    private Circle outerBow;
    private Circle innerBow;
    private Person dude;
    private Circle ring1;
    private Circle ring2;
    private Circle ring3;
    private Circle ring4;
    private Triangle outerFeet;
    private Triangle innerFeet;
    private Square tip;
    private Square shaft1;
    private Square shaft2;
    private Square shaft3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        outerBow = new Circle(40,260,180,"red");
        innerBow = new Circle(40,265,178,"white");
        dude = new Person();
        ring1 = new Circle(60,110,150,"magenta");
        ring2 = new Circle(50,115,155,"yellow");
        ring3 = new Circle(30,125,165,"green");
        ring4 = new Circle(10,135,175,"red");
        outerFeet = new Triangle(40,50,140,185,"black");
        innerFeet = new Triangle(60,70,140,200,"white");
        tip = new Square(10,200,180,"black");
        shaft1 = new Square(10,210,180,"red");
        shaft2 = new Square(10,220,180,"red");
        shaft3 = new Square(10,230,180,"red");
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            outerBow.makeVisible();
            innerBow.makeVisible();
            dude.makeVisible();
            outerFeet.makeVisible();
            innerFeet.makeVisible();
            ring1.makeVisible();
            ring2.makeVisible();
            ring3.makeVisible();
            ring4.makeVisible();
            tip.makeVisible();
            shaft1.makeVisible();
            shaft2.makeVisible();
            shaft3.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    
    public void setBlackAndWhite()
    {
        outerBow.changeColor("black");
        innerBow.changeColor("white");
        dude.changeColor("black");
        outerFeet.changeColor("black");
        innerFeet.changeColor("white");
        ring1.changeColor("black");
        ring2.changeColor("white");
        ring3.changeColor("black");
        ring4.changeColor("white");
        tip.changeColor("black");
        shaft1.changeColor("black");
        shaft2.changeColor("black");
        shaft3.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    
    public void setColor()
    {
        outerBow.changeColor("red");
        innerBow.changeColor("white");
        dude.changeColor("black");
        outerFeet.changeColor("black");
        innerFeet.changeColor("white");
        ring1.changeColor("magenta");
        ring2.changeColor("yellow");
        ring3.changeColor("green");
        ring4.changeColor("red");
        tip.changeColor("black");
        shaft1.changeColor("red");
        shaft2.changeColor("red");
        shaft3.changeColor("red");
    }

}
