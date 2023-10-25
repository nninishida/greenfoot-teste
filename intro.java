import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act(){
        //capa
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("introducao.png"));
        }
        //contexto
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("contexto.png"));
        }
        //fala dipper
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("dipperfalando.png"));
        }
        //fala mabel
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("falam.png"));
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
            MysteryShack world = new MysteryShack();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
