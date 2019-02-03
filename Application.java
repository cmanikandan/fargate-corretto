package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World. I'm running inside AWS Fargate and the Java Runtime version is " + System.getProperty("java.runtime.version") + " from "+ System.getProperty("java.vm.name") + " and my Java home is " + System.getProperty("java.home");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
