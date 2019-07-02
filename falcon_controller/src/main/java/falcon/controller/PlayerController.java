package falcon.controller;

import falcon.api.PlayerAPI;
import falcon.containers.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController implements PlayerAPI
{
    @Autowired
    public PlayerController()
    {

    }

    public ResponseEntity<Player> addPlayer(@RequestBody String name)
    {
        return new ResponseEntity<Player>(HttpStatus.OK);
    }

    public ResponseEntity<Player> getPlayer(@PathVariable(value = "id") Integer id)
    {
        return null;
    }

    public ResponseEntity<Player> updatePlayer(@PathVariable(value = "id")Integer id, @RequestBody String name)
    {
        return null;
    }

    public ResponseEntity deletePlayer(@PathVariable(value = "id")Integer id)
    {
        return null;
    }
}
