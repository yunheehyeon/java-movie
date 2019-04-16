import domain.Movie;
import domain.MovieRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        do {
            int movieId = InputView.inputMovieId();
            OutputView.printSelectMovie(movieId);
            int movieTime = InputView.inputMovieTime(movieId);
            int capacity = InputView.inputMovieCapacity(movieId, movieTime);
        } while (InputView.inputRestart());
    }

}
