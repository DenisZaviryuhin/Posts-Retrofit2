package org.example.app.network;
import org.example.app.entity.Post;
import org.example.app.entity.PostResponse;
import org.example.app.entity.PostsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ApiService {
    @GET("com/posts")
    Call<List<PostsResponse>> getPosts();
    @GET("com/posts/{id}")
    Call<PostResponse> getPostById(@Path("id") int id);
}