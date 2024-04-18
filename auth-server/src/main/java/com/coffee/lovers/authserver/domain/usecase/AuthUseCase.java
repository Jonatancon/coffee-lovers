package com.coffee.lovers.authserver.domain.usecase;

import com.coffee.lovers.authserver.adapters.message.MessagesError;
import com.coffee.lovers.authserver.domain.api.AuthApiPort;
import com.coffee.lovers.authserver.domain.model.Auth;
import com.coffee.lovers.authserver.domain.model.Token;
import com.coffee.lovers.authserver.domain.service.AuthService;
import com.coffee.lovers.model.exception.NotFound;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthUseCase implements AuthApiPort {
    private final AuthService authService;
    private final PasswordEncoder passwordEncoder;
    private final MessagesError messagesError;

    public AuthUseCase(AuthService authService, PasswordEncoder passwordEncoder, MessagesError messagesError) {
        this.authService = authService;
        this.passwordEncoder = passwordEncoder;
        this.messagesError = messagesError;
    }

    @Override
    public Token loginUser(Auth credential) {
        return null;
    }

    @Override
    public Token loginEmployed(Auth credential) {
        return null;
    }

    @Override
    public Token loginCoffeeShop(Auth credential) {
        return null;
    }

    @Override
    public Token validateTokenCoffeeShop(Token token) {
        return null;
    }

    @Override
    public Token validateTokenUser(Token token) {
        return null;
    }

    @Override
    public Token validateTokenEmployed(Token token) {
        return null;
    }

    private void validPassword(String passwordIn, String passwordOut) {
        if (!passwordEncoder.matches(passwordIn, passwordOut)) {
            throw new NotFound(messagesError.getError());
        }
    }
}
