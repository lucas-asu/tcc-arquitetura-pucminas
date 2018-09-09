package br.com.lcruz.tcc.app.login.business;

import br.com.lcruz.tcc.app.login.callback.LoginCallback;
import br.com.lcruz.tcc.app.login.model.LoginRequest;
import br.com.lcruz.tcc.app.login.model.LoginResponse;
import br.com.lcruz.tcc.app.login.provider.LoginProvider;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginBusiness {

    private LoginProvider provider;

    public LoginBusiness() {
        provider = new LoginProvider();
    }

    public void doLogin(String user, String password, final LoginCallback callback) {
        LoginRequest request = new LoginRequest(user, password);
        provider.doLogin(request).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()) {
                    callback.loginSuccess();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                callback.loginFailure();
            }
        });
    }
}
