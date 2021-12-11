package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cg.model.CatalogItem;
import com.cg.model.Movie;
import com.cg.model.Rating;
import com.cg.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private WebClient.Builder webBuilder;

	@GetMapping("/{userId}")
	public List<CatalogItem> retrieveCatalog(@PathVariable("userId") String userId) {
		//Retrieving the MovieId and rating with UserId
		UserRating rating = restTemplate.getForObject("http://ratings-data-service/rating/user/"+userId, UserRating.class);
		return rating.getRatings().stream().map(t -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + t.getMovieId(), Movie.class);		
			//putting them all together
			return new CatalogItem(movie.getMovieName(), movie.getGenre(), t.getRating());
		}).collect(Collectors.toList());

	}

}

//List<Rating> list = Arrays.asList(new Rating("1234", 4), new Rating("4537", 3));

/*   Web Client (asynchronous way)
 * 
 * Movie movie = webBuilder.build().get() .uri("http://localhost:8081/movies/" +
 * t.getMovieId()) .retrieve() .bodyToMono(Movie.class) .block();
 */
