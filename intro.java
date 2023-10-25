import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    public int atraso = 10;
    public int atraso1 = 10;
    public int atraso2 = 10;
    public int atraso3 = 10;
    public int atraso4 = 10;
    public int atraso5 = 10;
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
        atraso1--;
        //Diálogo Mário
        if (Greenfoot.isKeyDown("enter") && (atraso1 < 1)){
            setBackground(new GreenfootImage("contexto.png"));
            atraso2--;
        }
        //
        if(Greenfoot.isKeyDown("enter") && (atraso2 < 1)){
            setBackground(new GreenfootImage("dipperfalando.png"));
            atraso3--;
        }
        //Diálogo Mário
        if (Greenfoot.isKeyDown("enter") && (atraso3 < 1)){
            setBackground(new GreenfootImage("falam.png"));
            atraso4--;
        }
        //
        if (Greenfoot.isKeyDown("enter") && (atraso4 < 1)){
            setBackground(new GreenfootImage("antesdojogo.png"));
            atraso5--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (atraso4 < 1)){
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
