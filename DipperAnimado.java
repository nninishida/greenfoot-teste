import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DipperAnimado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DipperAnimado extends Actor
{
    GreenfootSound hadu = new GreenfootSound("hadouken.mp3");
    
    public int speed = 2;
    private int Timer= 0;
    /**
     * Act - do whatever the DipperAnimado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento()
    {
            if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
             else if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
            else if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
            else if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
            else if(Greenfoot.isKeyDown("m")){
            getWorld().addObject(new poder(), getX() - 100, getY() + 30);
        }
            else{
            if (Greenfoot.isKeyDown("m")) {
                hadu.play();
            }
        }
    }
}
