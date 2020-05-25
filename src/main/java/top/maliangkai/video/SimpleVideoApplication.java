package top.maliangkai.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.content.commons.repository.Store;
import org.springframework.content.rest.StoreRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SimpleVideoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleVideoApplication.class, args);
	}

	@StoreRestResource(path = "/videos")
	public interface VideoStore extends Store<String> { }

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
