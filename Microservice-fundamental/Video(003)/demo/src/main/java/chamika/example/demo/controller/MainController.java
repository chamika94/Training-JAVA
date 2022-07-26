package chamika.example.demo.controller;

import chamika.example.demo.model.Student;
import chamika.example.demo.servicer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String greeting1(){
      return "Hello this is from get";
    }

    @RequestMapping(value ="/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello this is from post";
    }

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
      return studentService.save(student);
    }
}
