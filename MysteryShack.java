import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MysteryShack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MysteryShack extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");
    
    public void started(){
        bgMusic.playLoop();
    }
    
    public void stopped(){
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class MysteryShack.
     * 
     */
    public MysteryShack()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        DipperAnimado dipperAnimado = new DipperAnimado();
        addObject(dipperAnimado,600,434);
        jose jose = new jose();
        addObject(jose,100,73);
        dipperAnimado.setLocation(636,482);
        dipperAnimado.setLocation(737,446);
        mable mable = new mable();
        addObject(mable,737,446);
        Counter counter = new Counter();
        addObject(counter,712,39);
        jose.setLocation(96,36);
        Counter counter2 = new Counter();
        addObject(counter2,96,36);
        jose.setLocation(113,174);
    }
}
