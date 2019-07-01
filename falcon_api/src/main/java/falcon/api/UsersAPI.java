package falcon.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public interface UsersAPI
{
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<String> addUser(String name);
}
