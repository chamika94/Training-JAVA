package chamika.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String greeting1(){
      return "Hello this is from get";
    }

    @RequestMapping(value ="/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello this is from post";
    }
}
