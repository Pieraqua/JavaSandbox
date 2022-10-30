package SimpleBattleship;

public class Ship {
    public Ship(boolean[][] architecture)
    {
        for(int x = 0; x < architecture.length; x++)
        {
            for(int y = 0; y < architecture[x].length; y++)
            {
                this.size += 1;
            }
        }
        assert(this.size >= 0) : 
        "Negative ship size is not permitted";
        this.architecture = architecture;
    }

    public boolean hit()
    {
        assert(this.size >= 0) : 
        "Negative ship size is not permitted";
        /* Check if ship sunk */
        this.size--;
        if(this.size == 0)
            return true;

        /* Ship hasnt sunk yet */
        return false;
    }

    public boolean[][] getArchitecture()
    { return architecture; }

    private boolean[][] architecture = null;
    private int size = 0;
}
