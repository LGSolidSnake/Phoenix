package falcon.controller;

import falcon.api.UsersAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UsersAPI
{
    public ResponseEntity<String> addUser(@RequestBody String name)
    {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
