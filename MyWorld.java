import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final int WIDTH_WALL = 50;
    private static final int HEIGHT_WALL = 50;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall=new Wall();
        int widthWall=wall.getImage().getWidth();
        
        for(int x=25; x<600; x+=widthWall){
            wall=new Wall();
            addObject(wall,x,23);
            wall=new Wall();
            addObject(wall,x,377);
        }
        
        for(int y=75; y<400; y+=widthWall){
            wall=new Wall();
            addObject(wall,25,y);
            wall=new Wall();
            addObject(wall,575,y);
        }
        
        Strawberry straw = new Strawberry();
        addObject(straw,212,258);
        Cherry cherry = new Cherry();
        addObject(cherry,372,168);
        Cherry cherry2 = new Cherry();
        Banana banana = new Banana();
        addObject(banana,483,90);
        BigBall bigBall = new BigBall();
        addObject(bigBall,264,107);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,197,109);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,387,235);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,133,251);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,502,285);
        addObject(cherry2,60,251);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,235,194);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,474,177);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,313,287);
        Ballon ballon = new Ballon();
        addObject(ballon,500,247);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);
        
        Pacman pacman = new Pacman(hud);
        addObject(pacman, 120, 100);
    }
}
