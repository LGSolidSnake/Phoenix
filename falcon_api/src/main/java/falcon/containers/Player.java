package falcon.containers;


/**
 * <p> This class is used to store player entries for and from the Escallation database</p>
 * @author Louis
 */
public class Player
{
    public static final String SQL_CREATE_STATEMENT = "CREATE OR REPLACE TABLE players\n" +
            "player_id INT NOT NULL AUTO_INCREMENT,\n" +
            "player_name VARCHAR(100) NOT NULL,\n" +
            "PRIMARY KEY (player_id)\n" +
            ");";

    private Integer playerID;
    private String name;

    public Player(Integer id, String name)
    {
        setName(name);
        setPlayerID(id);
    }

    //Getters and Setters
    public Integer getPlayerID()
    {
        return playerID;
    }

    public String getName()
    {
        return name;
    }

    public void setPlayerID(Integer id)
    {
        this.playerID = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
