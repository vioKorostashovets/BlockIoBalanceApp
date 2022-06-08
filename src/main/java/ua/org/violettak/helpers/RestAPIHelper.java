package ua.org.violettak.helpers;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestAPIHelper {
    public static String getStringResponse(String baseUrl, String endpoint, String apiKey, String pageNumber) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request;
        Response response;
        String requestBody = String.format("?api_key=%s&page=%s", apiKey,pageNumber);

        request = new Request
                .Builder()
                .url(baseUrl + endpoint + requestBody)
                .get()
                .build();
        response = client.newCall(request).execute();
        if(response.code()!= 200){
            throw new Exception("Failed response from com.violetta.tasks.API. Check you request, please");
        }
        return response.body().string();
    }
}
