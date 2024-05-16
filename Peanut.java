import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food our elephant wants to avoid.
 * 
 * @author Ho 
 * @version May 2024
 */
public class Peanut extends Actor
{
    int speed = 1;
    
    GreenfootImage peanutImage = new GreenfootImage("images/peanut.png");
    /**
     * Act - do whatever the Peanut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        peanutImage.scale(30, 30);
        setImage(peanutImage);
        
        MyWorld world = (MyWorld) getWorld();
        if(world.score < 0)
        {
            setLocation(getX(), getY());
            world.gameOver();
        }
        else
        {
            setLocation(getX(), getY() + speed);
            if(this.isAtEdge() == true)
            {
                world.removeObject(this);
                world.createPeanut();
            }
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
