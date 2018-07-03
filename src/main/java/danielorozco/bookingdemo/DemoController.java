package danielorozco.bookingdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hola")
    public String hola(){
        return ("Hola mundo");
    }

}
