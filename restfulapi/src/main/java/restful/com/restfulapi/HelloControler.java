package restful.com.restfulapi;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
/*@RequestMapping("/hello")
  public String hello(@RequestParam(name = "name", defaultValue = "rahul") String name) {
      return "hello" + name;*/


	@GetMapping("/hello")
  public String hello(@RequestParam(name = "name", defaultValue = "praveena") String name) {
      return "hello" + name;
   

      }
  }
