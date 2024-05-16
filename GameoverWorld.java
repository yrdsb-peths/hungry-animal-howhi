import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Gameover Screen.
 * 
 * @author Ho
 * @version May 2024
 */
public class GameoverWorld extends World
{
    MyWorld world = new MyWorld();
    public GameoverWorld()
    {    
        super(600, 400, 1); 
        
        // What's showing on the gameover screen
        Label gameOverLabel = new Label("Game Over", 125);
        addObject(gameOverLabel, 300, 200);
        
        Label resetLabel = new Label("Press <space> to play again", 40);
        addObject(resetLabel, 300, 300);
    }
    
    public void act()
    {
        // Replaying game
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
