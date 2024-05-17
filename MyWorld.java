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
    public MyWorld()
    {    
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label showing "Score: "
        scoreLabel = new Label("Score: ", 70);
        addObject(scoreLabel, 125, 50);
        
        // Create another label showing the value of the user's score for
        // that round.
        scoreLabelValue = new Label(0, 70);
        addObject(scoreLabelValue, 230, 50);
        
        
        // Spawn the apple and the peanut
        createApple();
        createPeanut();
    }
    
    public void act()
    {
        // Game is over if elephant misses three consecutive apples
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
    
    
    /**
     * Decrease score
     */
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
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        addObject(apple, x, y);
    }
    
    /**
     * Create a new peanut at random location at top of screen
     */
    public void createPeanut()
    {
        Peanut peanut = new Peanut();        
        peanut.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;    
        addObject(peanut, x, y);
    }
}
