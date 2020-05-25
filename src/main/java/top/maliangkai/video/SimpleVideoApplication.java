package top.maliangkai.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.content.commons.repository.Store;
import org.springframework.content.rest.StoreRestResource;

@SpringBootApplication
public class SimpleVideoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleVideoApplication.class, args);
	}

	@StoreRestResource(path = "videos")
	public interface VideoStore extends Store<String> { }

}
