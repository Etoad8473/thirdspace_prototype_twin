package com.example.sumon.androidvolley.api;

import com.example.sumon.androidvolley.model.Personality;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
/**
 * @author kaiheng
 */
public interface PersonalityApi {

    @POST("personality")
    Call<PersonalityApi> PostPersonalityByBody(@Body PersonalityApi newPersonality);

    @POST("users/{uId}/hobby/{hId}")
    Call<PersonalityApi> PostHobbyToUser(@Path("uId") int userId, @Path("hId") int hobbyId);

    @POST("users/{uId}/interest/{iId}")
    Call<PersonalityApi> PostInterestToUser(@Path("uId") int userId, @Path("iId") int interestId);

    @POST("users/{uId}/value/{vId}")
    Call<PersonalityApi> PostValueToUser(@Path("uId") int userId, @Path("vId") int valueId);

    @POST("hobby/{name}")
    Call<PersonalityApi> AddHobby(@Path("name") String hobbyName);

    @POST("interest/{name}")
    Call<PersonalityApi> AddInterest(@Path("name") String interestName);

    @POST("value/{name}")
    Call<PersonalityApi> AddValue(@Path("name") String valueName);

    @POST("users/{uId}")
    Call<PersonalityApi> PostDemographicsToUser(@Path("uId") int userId, @Body Personality newPersonality);

}
