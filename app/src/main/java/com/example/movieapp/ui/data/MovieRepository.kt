package com.example.movieapp.data

object MovieRepository {
    val movies = listOf(
        Movie(
            id = 1,
            title = "Spider-Man: Homecoming",
            genre = "Action/Fantasy",
            rating = 7.5,
            posterUrl = "https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p12798844_p_v8_ao.jpg",
            description = "Peter Parker tries to stop Adrian 'The Vulture' Toomes from selling weapons made with advanced Chitauri technology while trying to balance his life as an ordinary high school student."
        ),
        Movie(
            id = 2,
            title = "Spider-Man: Far From Home",
            genre = "Action/Sci-fi ",
            rating = 7.3,
            posterUrl = "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/3/35/Official_FFH_US_Poster.jpg/revision/latest?cb=20190522171521",
            description = "Peter Parker, the beloved superhero Spider-Man, faces four destructive elemental monsters while on holiday in Europe. Soon, he receives help from Mysterio, a fellow hero with mysterious origins."
        ),
        Movie(
            id = 3,
            title = "Spider-Man: No Way Home",
            genre = "Action/Sci-fi",
            rating = 8.1,
            posterUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmLaF8PvOHncZau_WfsxIutH9LEu1b3q_wzciY1a6M0Od7IOBQRumhJU1iQTC7jNJDgKnmUg&s=10",
            description = "Spider-Man seeks the help of Doctor Strange to forget his exposed secret identity as Peter Parker. However, Strange's spell goes horribly wrong, leading to unwanted guests entering their universe."
        ),
        Movie(
            id = 4,
            title = "Spider-Man: Brand New Day",
            genre = "Action/Adventure",
            rating = 8.1,
            posterUrl = "https://m.media-amazon.com/images/M/MV5BOWNjYWM3NWItOGE0ZS00MWRjLThiZWEtYjc4ZmNmMmU5ZTVmXkEyXkFqcGc@._V1_.jpg",
            description = "Peter Parker devotes his life to protecting New York City as a full-time Spider-Man. But as the demands on him intensify, the pressure sparks a surprising physical evolution that threatens his existence, even as a strange new pattern of crimes gives rise to one of the most powerful threats he's ever faced."
        ),
        Movie(
            id = 5,
            title = "The Amazing Spider-Man",
            genre = "Action/Sci-fi",
            rating = 7.0,
            posterUrl = "https://m.media-amazon.com/images/M/MV5BMjMyOTM4MDMxNV5BMl5BanBnXkFtZTcwNjIyNzExOA@@._V1_.jpg",
            description = "Peter Parker, an outcast high school student, gets bitten by a radioactive spider and attains superpowers. While unravelling his parents' disappearance, he must fight against the Lizard."
        ),
        Movie(
            id = 6,
            title = "The Amazing Spider-Man 2",
            genre = "Action/Adventure",
            rating = 6.6,
            posterUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3cbwj9BDZO8O7Q88qAXUr3Rkjptk4Acvug7umOrKgm7n71sS_m6tbuee2Grj_Xs0z0yv3-g&s=10",
            description = "As Peter Parker safeguards New York City from criminals, a set of circumstances leads to Peter battling against Electro, a powerful enemy. Peter realises that Oscorp is the entity that links his foes."
        ),
        Movie(
            id = 7,
            title = "Spider-Man",
            genre = "Action/Sci-fi",
            rating = 7.4,
            posterUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/97e4becb-d3b7-4732-8039-af5e062af33c/d80mdqw-d4faca1f-e866-4f05-90be-878fc8b2d7b7.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzk3ZTRiZWNiLWQzYjctNDczMi04MDM5LWFmNWUwNjJhZjMzY1wvZDgwbWRxdy1kNGZhY2ExZi1lODY2LTRmMDUtOTBiZS04NzhmYzhiMmQ3YjcuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.PJjj9uJ1IH5Ox0ObJwZcGbKuZwzYhtaoGP4I3HErAus",
            description = "student, is often bullied by people, including his best friend. His life changes when he is bitten by a genetically altered spider and gains superpowers."
        ),
        Movie(
            id = 8,
            title = "Spider-Man 2",
            genre = "Action/Sci-fi",
            rating = 7.5,
            posterUrl = "https://m.media-amazon.com/images/M/MV5BNGQ0YTQyYTgtNWI2YS00NTE2LWJmNDItNTFlMTUwNmFlZTM0XkEyXkFqcGc@._V1_.jpg",
            description = "Peter Parker is dissatisfied with life as he loses his job, the love of his life, Mary Jane, and his powers. Amid all the chaos, he must fight Doctor Octopus who threatens to destroy New York City."
        ),
        Movie(
            id = 9,
            title = "Spider-Man 3",
            genre = "Action/Sci-fi",
            rating = 6.3,
            posterUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFO3qfGyii0d_BKsec-NrPlfj3xNne-KEWE_9074RDFUicolNdf1q2zjbK6N0cG7ROZhDJ&s=10",
            description = "Peter Parker becomes one with a symbiotic alien that bolsters his Spider-Man avatar and affects his psyche. He also has to deal with Sandman and maintain a fragmented relationship with Mary Jane."
        )
    )

    fun getMovieById(id: Int): Movie? = movies.find { it.id == id }
}