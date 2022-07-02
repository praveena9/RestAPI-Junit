package restful.com.restfulapi;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/hello/{name}")
  public String helloName(@PathVariable(name = "name") String name) {
      return "hello" + name;
  }


	@GetMapping("/hello")
  public String hello() {
      return "hello";
   

      }
  }
