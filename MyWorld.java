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
    Label scoreLabelValue;
    int level = 1;
    public int applesMissed = 0;
    public int[] scores;
    public int highScore;
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
        scoreLabel = new Label("Score: ", 70);
        addObject(scoreLabel, 125, 50);
        
        scoreLabelValue = new Label(0, 70);
        addObject(scoreLabelValue, 230, 50);
        
        createApple();
        createPeanut();
    }
    
    public void act()
    {
        if(applesMissed == 3)
        {
            gameOver();
        }
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
        scoreLabelValue.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabelValue.setValue(score);        
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
    }
}
