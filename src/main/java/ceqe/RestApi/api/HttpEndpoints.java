package ceqe.RestApi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpEndpoints {

    @GetMapping
    public String sample(){
        return "cool";
    }
}
