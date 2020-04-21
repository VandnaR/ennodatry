import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	
	@Value("${DOCKER_ENV_VARIABLE:default}")
	private String msg;
	
	public static void main(String[] args)
	{
		SpringApplication.run(DockerApplication.class, args);
	}
	
    @RequestMapping(value="/docker-env",method=RequestMethod.GET)
    public String getDocker()
    {
    	return msg;
    }
    

}
