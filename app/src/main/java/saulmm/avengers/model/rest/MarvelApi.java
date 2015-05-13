package saulmm.avengers.model.rest;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;
import saulmm.avengers.model.Character;
import saulmm.avengers.model.Comic;

public interface MarvelApi {

    public final String END_POINT       = "http://gateway.marvel.com/";
    public final String PARAM_API_KEY   = "apikey";
    public final String PARAM_HASH      = "hash";
    public final String PARAM_TIMESTAMP = "ts";

    @GET("/v1/public/characters")
    Observable<Character> getCharacter(@Query("id") int id);

    @GET("/v1/public/characters/{characterId}/comics")
    Observable<List<Comic>> getCharacterComics(@Path("characterId") int id,
                            @Query("format") String format,
                            @Query("formatType") String fromatType);
}
