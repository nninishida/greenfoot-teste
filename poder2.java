import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends jose
{
    /**
     * Act - do whatever the poder2 wants to do. This method is called whenever
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
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x,y);
    }
     public void acertarAlvo() {
        Actor f = getOneIntersectingObject(DipperAnimado.class);
        
        if (f!= null) {
            Counter counter2 = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter2.add(1);
            getWorld().removeObject(f);
            getWorld().removeObject(this);
        }
    }
}
