import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Ho
 * @version May 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 100);
    public TitleScreen()
    {    
        super(600, 400, 1); 

        // Adding title screen text
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Placing elephant and instructions on title screen.
        Elephant elephant = new Elephant();
        addObject(elephant,476,71);
        elephant.setLocation(474,91);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label, 300, 300);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2, 300, 350);
    }
}
