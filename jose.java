import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jose extends Actor
{
    public int speed = 3;
    /**
     * Act - do whatever the jose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        movimento();
    }
    public void movimento()
    {
            if(Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
            else if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
            else if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
            else if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
            else if(Greenfoot.isKeyDown("f")){
            getWorld().addObject(new poder2(), getX() +150, getY() + 30);
        }
    }
}
