package br.com.lcruz.tcc.app.login.manager;

import br.com.lcruz.tcc.app.login.business.LoginBusiness;
import br.com.lcruz.tcc.app.login.callback.LoginCallback;

public class LoginManager {

    private LoginBusiness business;

    public LoginManager() {
        business = new LoginBusiness();
    }

    public void doLogin(String user, String password, final LoginCallback callback) {
        business.doLogin(user,password, callback);
    }
}
