package katas;

import model.Movie;
import model.MovieList;
import util.DataUtil;
import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> moviesList = DataUtil.getMovieLists();
        return moviesList.stream()
                .flatMap(mp -> mp.getVideos().stream())
                .map(Movie::getId)
                .collect(Collectors.toList());
        // return ImmutableList.of(1, 2, 3);
    }
}
