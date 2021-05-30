package tech.itpark.k8sbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
@RequestMapping("/**")
public class K8sBackendApplication {
  private final String id = UUID.randomUUID().toString();

  @GetMapping
  public String hello() {
    return id;
  }

  public static void main(String[] args) {
    SpringApplication.run(K8sBackendApplication.class, args);
  }

}
