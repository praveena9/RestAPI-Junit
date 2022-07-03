package restful.com.restfulapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    List<String> names=new ArrayList<>();
  @GetMapping("/hello/{name}")
  public String helloName(@PathVariable(name = "name") String name) {
      return "hello" + name;
  }


	@GetMapping("/hello")
  public String hello() {
      return "hello";
      }

      @PostMapping("/hello/add")
    public String add(@PathVariable(name="name") String name)
      {
          names.add(name);
          return "added successfully";
      }

  }
