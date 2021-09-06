package com.hiersun.hothatch.commons.util;

import com.hiersun.hothatch.pojo.ResponseMessage;
import okhttp3.*;

import java.util.concurrent.TimeUnit;

public class OkHttp3Util {

    public static ResponseMessage doHttp(String destUrl, String message, Integer timeout) throws Exception {
        MediaType mediaType = MediaType.Companion.parse("application/json;charset=utf-8");
        RequestBody requestBody = RequestBody.Companion.create(message, mediaType);

        Response response = new OkHttpClient.Builder()
                .connectTimeout(20L, TimeUnit.SECONDS)
                .readTimeout(60L, TimeUnit.SECONDS)
                .writeTimeout(timeout, TimeUnit.SECONDS)
                .build()
                .newCall(
                        new Request.Builder()
                                .url(destUrl)
                                .post(requestBody)
                                .build()
                )
                .execute();
        return new ResponseMessage()
                .setStatusCode(response.code())
                .setCallResult(response.body().string())
                .setHeader(response.headers().toMultimap());
    }

}
