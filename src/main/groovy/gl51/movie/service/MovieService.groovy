package gl51.movie.service

import gl51.movie.data.Movie

interface MovieService {
     Movie getMovieInformations(String imdb)
}