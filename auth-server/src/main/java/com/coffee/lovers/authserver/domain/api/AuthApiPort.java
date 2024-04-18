package com.coffee.lovers.authserver.domain.api;

import com.coffee.lovers.authserver.domain.model.Auth;
import com.coffee.lovers.authserver.domain.model.Token;

public interface AuthApiPort {
    Token loginUser(Auth credential);
    Token loginEmployed(Auth credential);
    Token loginCoffeeShop(Auth credential);
    Token validateTokenCoffeeShop(Token token);
    Token validateTokenUser(Token token);
    Token validateTokenEmployed(Token token);

}
