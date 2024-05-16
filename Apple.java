import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Ho 
 * @version April 2024
 */
public class Apple extends Actor
{
    int speed = 1;
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        // If score is less than 0, this stops the apple's movement and
        // ends the game.
        if(world.score < 0)
        {
            setLocation(getX(), getY());
            world.gameOver();
        }
        // If score is not less than 0, this keeps the peanut's movement going.
        else
        {
            setLocation(getX(), getY() + speed);
            if(this.isAtEdge() == true)
            {
                world.removeObject(this);
                world.createApple();
                world.applesMissed++;
            }
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
