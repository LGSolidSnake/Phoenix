package falcon.api;

import falcon.containers.Player;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(value = "Player API", description = "Used for CRUD operations for player")
@RequestMapping(value = "/player", produces = {MediaType.APPLICATION_JSON_VALUE})
@ApiResponses(
        @ApiResponse(code = 500, message = "Internal Server Error")
)
public interface PlayerAPI
{
    @ApiOperation(value = "Add Player operation", notes = "Add Player operation")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<Player> addPlayer(String name);

    @ApiOperation(value = "Get Player operation", notes = "Get Player operation")
    @RequestMapping(value = "/[id]", method = RequestMethod.GET)
    ResponseEntity<Player> getPlayer(Integer id);

    @ApiOperation(value = "Update Player operation", notes = "Update Player operation")
    @RequestMapping(value = "/[id]", method = RequestMethod.PATCH)
    ResponseEntity<Player> updatePlayer(Integer id, String name);

    @ApiOperation(value = "Delete Player operation", notes = "Delete Player operation")
    @RequestMapping(value = "/[id]", method = RequestMethod.DELETE)
    ResponseEntity deletePlayer(Integer id);
}
