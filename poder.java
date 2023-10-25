import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder extends DipperAnimado
{
    /**
     * Act - do whatever the poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x,y);
    }
    public void acertarAlvo() {
        Actor m = getOneIntersectingObject(jose.class);
        
        if (m!= null) {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(m);
            getWorld().removeObject(this);
        }
    }
}
