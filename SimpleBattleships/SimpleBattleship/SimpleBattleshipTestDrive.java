package SimpleBattleship;

import java.util.Random;

public class SimpleBattleshipTestDrive {
    
    public static final boolean debug = false;
    public static void main(String args[])
    {
        SimpleBattleship game = new SimpleBattleship();
        Ship[][] battlemap = new Ship[5][5];

        for(int x = 0; x < battlemap.length; x++)
        {
            for(int y = 0; y < battlemap[x].length; y++)
            {
                battlemap[x][y] = null;
            }
        }

        boolean[][] cruiserArc = {{true,true,true}};
        Ship cruiser = new Ship(cruiserArc);
        Random rand = new Random();

        int[] pos = {rand.nextInt(battlemap.length), rand.nextInt(battlemap[0].length)};
        int retries = 500;
        while(game.buildShip(battlemap, pos, cruiser) == false && retries > 0)
        {
            pos[0] = rand.nextInt(1);
            pos[1] = rand.nextInt(7);
            retries--;
        }
        
        game.printMap(battlemap);

        GameHelper helper = new GameHelper();
        boolean running = false;
        int x,y = 0;
        while(!running){
            do {
                x = helper.getUserInput("Fire at what x square?");
                if(x >= battlemap.length || x < 0)
                {
                    System.out.println("Invalid coordinate.");
                }
            }while(x >= battlemap.length || x < 0);
            do{
                y = helper.getUserInput("Fire at what y square?");
                if(y >= battlemap[x].length || y < 0)
                {
                    System.out.println("Invalid coordinate.");
                }
            }while(y >= battlemap[x].length || y < 0);

            if(battlemap[x][y] != null)
            {
                running = battlemap[x][y].hit();
                battlemap[x][y] = null;
                System.out.println("Hit!");
                game.printMap(battlemap);
            }
        }

        System.out.println("You win!");
    }

    
}

