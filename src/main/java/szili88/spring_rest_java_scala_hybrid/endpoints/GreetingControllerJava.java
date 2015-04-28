package szili88.spring_rest_java_scala_hybrid.endpoints;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerJava {

    @RequestMapping("/java/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, Java " + name + "!";
    }
}
