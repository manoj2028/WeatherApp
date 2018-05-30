package report.activity.model;

/**
 * Created by manojg on 5/30/2018.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;




public interface Response {

    @GET("forecast")
    Call<String> getCity(@Query("APPID") String apiKey, @Query("q") String cityname);
    @GET("forecast")
    Call<String> getLocation(@Query("APPID") String apiKey, @Query("lat") String lat,@Query("lon") String lon);

}