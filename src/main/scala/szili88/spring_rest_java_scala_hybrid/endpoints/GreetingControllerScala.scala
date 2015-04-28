package szili88.spring_rest_java_scala_hybrid.endpoints

import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RestController}

@RestController
class GreetingControllerScala {
  @RequestMapping(Array("/scala/hello/{name}"))
  def hello(@PathVariable name: String) = {
    "Hello, Scala " + name + "!"
  }
}
