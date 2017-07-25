@RestController
public class HelloWorld{
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello World! We are in SpringBoot!";
	}

}