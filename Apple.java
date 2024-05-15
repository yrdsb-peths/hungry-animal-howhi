import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Ho 
 * @version April 2024
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        if(world.score < 0)
        {
            setLocation(getX(), getY());
            world.gameOver();
        }
        else
        {
            setLocation(getX(), getY() + speed);
            if(getY() >= world.getHeight())
            {
                world.removeObject(this);
                world.createApple();
                world.applesMissed++;
            }
        }
        
        // Remove apple and draw game over when apple gets to bottom
        
        
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
