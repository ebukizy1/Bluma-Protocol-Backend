import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class RenderEndpointController {


    @GetMapping("/wakeRender")
    public ResponseEntity<String> wakeRender() {
        return ResponseEntity.ok("Render server is awake");
    }


}
