package falcon.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public interface UsersAPI
{

    public ResponseEntity<String> addUser(String name);
}
