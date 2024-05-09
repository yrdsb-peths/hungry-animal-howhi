import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Ho
 * @version May 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
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
        Elephant elephant = new Elephant();
        addObject(elephant,476,71);
        elephant.setLocation(474,91);
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label,200,238);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,219,333);
        label.setLocation(320,269);
        label2.setLocation(360,320);
        label.setLocation(296,255);
        label2.setLocation(237,326);
        label2.setLocation(330,329);
        label2.setLocation(293,324);
        label.setLocation(446,281);
        label2.setLocation(401,322);
        label.setLocation(372,287);
        label2.setLocation(302,319);
        label.setLocation(287,282);
        label.setLocation(338,278);
        label.setLocation(292,272);
        label.setLocation(323,273);
        label2.setLocation(288,340);
        label.setLocation(258,289);
        label.setLocation(252,286);
        label.setLocation(200,303);
        label.setLocation(296,301);
    }
}
