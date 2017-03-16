
/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower implements PlantInterface
{
    int x, y;
    double height, width, growth;
    
    public Flower (int x, int y)
    {
        x = this.x;
        y = this.y;
        height = 5;
        width = 1;
        growth = .5;
    }
    
    public void grow(int days)
    {
        for(int i = 0; i < days; i++)
            height += height * growth;
    }
    
    public void rain (int days)
    {
        growth += days * .1;
    }
    
    public void frost()
    {
        growth = 0;
        height = 0;
        width = 0;
    }
    
    public void draw()
    {
        System.out.println(this.toString());
    }
    
    public String toString()
    {
        return "The flower is at (" + x + ", " + y + "), is " + height + " wide, and is " + width + " tall";
    }
}
