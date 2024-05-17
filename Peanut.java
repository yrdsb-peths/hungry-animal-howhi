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
    
    // Setting peanut instance image to a peanut
    GreenfootImage peanutImage = new GreenfootImage("images/peanut.png");
    
    public void act()
    {
        // Scaling peanut image
        peanutImage.scale(30, 30);
        setImage(peanutImage);
        
        
        MyWorld world = (MyWorld) getWorld();
        
        // If score is less than 0, this stops the peanut's spawning and
        // ends the game.
        if(world.score < 0)
        {
            setLocation(getX(), getY());
            world.gameOver();
        }
        // If score is not less than 0, this keeps the peanut respawning 
        // and falling down.
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
