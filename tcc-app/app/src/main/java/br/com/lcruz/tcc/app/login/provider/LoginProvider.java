package br.com.lcruz.tcc.app.login.provider;

import br.com.lcruz.tcc.app.login.model.LoginRequest;
import br.com.lcruz.tcc.app.login.model.LoginResponse;
import br.com.lcruz.tcc.app.login.service.LoginService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginProvider {

    private LoginService service;

    public LoginProvider() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://demo7841592.mockable.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(LoginService.class);
    }

    public Call<LoginResponse> doLogin(LoginRequest request){
        return service.doLogin(request);
    }

}
