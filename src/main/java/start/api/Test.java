package start.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import start.utils.ResponseHandler;

@RestController
@CrossOrigin(origins = "*")
public class Test {

    @Autowired
    ResponseHandler responseHandler;

    @GetMapping("/authen")
    @PreAuthorize("hasAuthority('aaaaaaaaaaa')")
    public void authen(){
        System.out.println("authen");
    }


    @GetMapping("/unauthen")
    public ResponseEntity unauthen(){
        return responseHandler.response(200, "No Authen", "ok");
    }
}
