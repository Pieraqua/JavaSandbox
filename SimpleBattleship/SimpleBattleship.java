package SimpleBattleship;

public class SimpleBattleship {
    public boolean buildShip(Ship[][] battlemap, int[] pos, Ship ship)
    {

        Ship[][] auxMap = battlemap.clone();
        for (int r = 0; r < battlemap.length; r++) {
            auxMap[r] = auxMap[r].clone();
        }


        for(int i = 0; i < ship.getArchitecture().length; i++)
        {
            for(int z = 0; z < ship.getArchitecture()[i].length; z++)
            {
                if(pos[0] + i < auxMap.length && pos[1] + z < auxMap[i].length && auxMap[i][z] == null)
                {
                    auxMap[pos[0] + i][pos[1] + z] = ship;
                }
                else
                {
                    if(SimpleBattleshipTestDrive.debug){
                    System.out.println("Cant fit ship into position " + pos[0] + "," + pos[1]);
                    }
                    return false;
                } 
            }
        }

        for (int r = 0; r < battlemap.length; r++) {
            battlemap[r] = auxMap[r];
        }
        return true;
    }

    public void printMap(Ship[][] battlemap)
    {
        for(int i = 0; i < battlemap.length; i++)
        {
            for(int z = 0; z < battlemap[i].length; z++)
            {
                if(battlemap[i][z] == null)
                    System.out.print("0");
                else
                    System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
