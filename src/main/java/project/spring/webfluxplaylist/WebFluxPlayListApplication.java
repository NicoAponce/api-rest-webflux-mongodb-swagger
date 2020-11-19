package project.spring.webfluxplaylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.spring.webfluxplaylist.document.Playlist;
import project.spring.webfluxplaylist.repository.PlaylistRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

@SpringBootApplication
public class WebFluxPlayListApplication implements CommandLineRunner {

    /*@Autowired
    private PlaylistRepository playlistRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(WebFluxPlayListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*playlistRepository.deleteAll()
                .thenMany(
                        Flux.just(
                                "Java",
                                "Spring-boot",
                                "Hibernate",
                                "Android",
                                "kotlin",
                                "Json",
                                "RXJava",
                                "Javascript",
                                "Angular",
                                "React",
                                "Vanilla")
                                .map(value -> new Playlist(UUID.randomUUID().toString(), value))
                                .flatMap(playlistRepository::save)
                ).subscribe(System.out::println);*/
    }
}
