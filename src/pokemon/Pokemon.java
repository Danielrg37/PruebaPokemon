package pokemon;


/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon
{
    // instance variables - replace the example below with your own
    private int health;
    private int strength;
    private int speed;
    private String name;
    private static final int INITIAL_HEALTH = 301;
    private static final int INITIAL_STRENGTH = 51;
    private static final int INITIAL_SPEED = 201;
    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon()
    {
        health=(int)Math.floor(Math.random()* (INITIAL_HEALTH - 0 + 1)) + 0;
        strength=(int)Math.floor(Math.random()* (INITIAL_STRENGTH - 0 + 1)) + 0;
        speed=(int)Math.floor(Math.random()* (INITIAL_SPEED - 0 + 1)) + 0;
        name = " ";
    }
    
    public Pokemon(int health, int strength, int speed, String name){
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
    }

    public int getHealth(){
        return health;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public String getName(){
        return name;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
}
