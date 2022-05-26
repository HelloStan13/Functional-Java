package katas;

import model.Movie;
import util.DataUtil;
import java.util.List;
import java.util.Optional;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();
        Optional<String> urlLargest = movies.stream()
                .flatMap(f -> f.getBoxarts().stream()).reduce((x, y) -> {
                    if (x.getWidth() * x.getHeight() >= y.getWidth() * y.getHeight()) {
                        return x;
                    } else {
                        return y;
                    }
                })
                .map(b -> b.getUrl());
        return urlLargest.get();
//        return "someUrl";
    }
}
