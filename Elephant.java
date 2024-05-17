import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Ho
 * @version April 2024
 */
public class Elephant extends Actor
{
    //Different elephant sounds
    GreenfootSound elephantHappy = new GreenfootSound("elephanttrumpetgrowl.mp3");
    GreenfootSound elephantSad = new GreenfootSound("elephantscream.mp3");
    
    //Array of elephant idle images
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    // Direction the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    
    MyWorld world = (MyWorld) getWorld();    
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
        
        animationTimer.mark();
        
        // Initial elephant image
        setImage(idleRight[0]);
        
       
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
    public void act()
    {
        // How to move the elephant
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        } 
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        // Remove apple and peanut if elephant eats it
        eat();
        
        // Animate the elephant
        animateElephant();
    }
    
    
    // Eating objects falling from the sky
    public void eat()
    {
        /**
         * If the elephant eats an apple, spawn a new peanut and increase
         * score by 1.
         */
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.applesMissed = 0;
            world.increaseScore();
            world.createApple();
            elephantHappy.play();
        }
        
        
        /**
         * If the elephant accidentally eats a peanut, spawn a new peanut
         * and decrease score by 1.
         */
        if(isTouching(Peanut.class))
        {
            removeTouching(Peanut.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseScore();
            world.createPeanut();
            elephantSad.play();
        }
        
    }
}
