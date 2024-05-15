import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Gameover Screen.
 * 
 * @author Ho
 * @version May 2024
 */
public class GameoverWorld extends World
{

    /**
     * Constructor for objects of class GameoverWorld.
     * 
     */
    
    MyWorld world = new MyWorld();
    public GameoverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label gameOverLabel = new Label("Game Over", 125);
        addObject(gameOverLabel, 300, 200);
        
        Label resetLabel = new Label("Press <space> to play again", 40);
        addObject(resetLabel, 300, 300);
    }
    
    public void act()
    {        
        if(world.score > world.highScore);
        {
            
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
