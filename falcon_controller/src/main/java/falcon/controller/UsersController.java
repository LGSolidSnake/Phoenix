package falcon.controller;

import falcon.api.UsersAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UsersController implements UsersAPI
{
    public ResponseEntity<String> addUser(String name)
    {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
