package com.boyma.mxsmpl.net.jsonplaceholder.allnews;


import com.boyma.mxsmpl.net.jsonplaceholder.allnews.models.ResponseJsonObj;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ISiteApi {
    @GET
    Observable<List<ResponseJsonObj>> getResponseJsonObj(@Url String url);
}
