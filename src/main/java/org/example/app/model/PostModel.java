package org.example.app.model;
import org.example.app.entity.PostResponse;
import org.example.app.entity.PostsResponse;
import org.example.app.network.ApiClient;
import org.example.app.network.ApiService;
import retrofit2.Call;
import retrofit2.Response;

import java.util.Optional;
import java.util.List;

public class PostModel {
    public Optional<Response<List<PostsResponse>>> fetchPosts() {
        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();
        Call<List<PostsResponse>> call = service.getPosts();
        Optional<Response<List<PostsResponse>>> optional;
        try {
            optional = Optional.of(call.execute());
        } catch (Exception exception) {
            optional = Optional.empty();

        }
        return optional;
    }

    public Optional<Response<PostResponse>> fetchPostById(int id) {
        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();
        Call<PostResponse> call = service.getPostById(id);
        Optional<Response<PostResponse>> optional;
        try {
            optional = Optional.of(call.execute());
        } catch (Exception exception) {
            optional = Optional.empty();
        }
        return optional;
    }

}
