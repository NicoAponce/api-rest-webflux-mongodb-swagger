package project.spring.webfluxplaylist.controller;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.MediaType;import org.springframework.web.bind.annotation.*;import project.spring.webfluxplaylist.document.Playlist;import project.spring.webfluxplaylist.service.PlaylistService;import reactor.core.publisher.Flux;import reactor.core.publisher.Mono;import reactor.util.function.Tuple2;import java.time.Duration;@RestController@RequestMapping("/api/playlist")public class PlaylistController {    @Autowired    private PlaylistService playlistService;    @GetMapping    public Flux<Playlist> findAll() {        return playlistService.findAll();    }    @GetMapping("/{id}")    public Mono<Playlist> findById(@PathVariable String id) {        return playlistService.findById(id);    }    @PostMapping    public Mono<Playlist> save(@RequestBody Playlist playlist) {        return playlistService.save(playlist);    }    @GetMapping(value = "/events",produces = MediaType.TEXT_EVENT_STREAM_VALUE)    public Flux<Tuple2<Long, Playlist>> getPlaylistByEvent() {        Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));        Flux<Playlist> playlistFlux = playlistService.findAll();        return Flux.zip(interval, playlistFlux);    }}