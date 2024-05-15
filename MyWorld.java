import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Ho 
 * @version April 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    SimpleTimer peanutTimer = new SimpleTimer();
    int peanutSeconds = 1000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        peanutTimer.mark();
        createPeanut();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        GameoverWorld gameOverWorld = new GameoverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);        
        if(score % 5 == 0)
        {
            level -= 1;
        }
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level + 1);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        addObject(apple, x, y);
    }
    
    public void createPeanut()
    {
        Peanut peanut = new Peanut();        
        peanut.setSpeed(level + 1);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;    
        addObject(peanut, x, y);
        if(peanutTimer.millisElapsed() < peanutSeconds)
        {
            return;
        }
        peanutTimer.mark();
    }
}
