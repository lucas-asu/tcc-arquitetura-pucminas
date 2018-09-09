package br.com.lcruz.tcc.app.login.service;

import br.com.lcruz.tcc.app.login.model.LoginRequest;
import br.com.lcruz.tcc.app.login.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginService {

    @POST("login")
    Call<LoginResponse> doLogin(@Body LoginRequest loginRequest);
}
