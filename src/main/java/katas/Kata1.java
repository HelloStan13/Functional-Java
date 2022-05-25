package katas;

import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();
        List<Map> result = movies.stream().map(mp->ImmutableMap.of(mp.getId(), mp.getTitle()))
                .collect(Collectors.toList());
        System.out.println(result);
        return result;
    }
}
