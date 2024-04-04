package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.usuarios.domain.service.*;
import com.coffee.lovers.usuarios.domain.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseService {

    @Bean
    public AccountUseCase getAccountUseCase (AccountService service) {
        return new AccountUseCase(service);
    }
    @Bean
    public AddressUseCase getAddressUseCase (AddressService service) {
        return new AddressUseCase(service);
    }
    @Bean
    public FinancialInstitutionUseCase getFinancialInstitutionUseCase (FinancialInstitutionService service) {
        return new FinancialInstitutionUseCase(service);
    }
    @Bean
    public ImageUseCase getImageUseCase (ImageService service) {
        return new ImageUseCase(service);
    }
    @Bean
    public ModuleUseCase getModuleUseCase (ModuleService service) {
        return new ModuleUseCase(service);
    }
    @Bean
    public OperationUseCase getOperationUseCase (OperationService service) {
        return new OperationUseCase(service);
    }
    @Bean
    public RolOperationUseCase getRolOperationUseCase (RolOperationService service) {
        return new RolOperationUseCase(service);
    }
    @Bean
    public RolUseCase getRolUseCase (RolService service) {
        return new RolUseCase(service);
    }
    @Bean
    public TypeAccountUseCase getTypeAccountUseCase (TypeAccountService service) {
        return new TypeAccountUseCase(service);
    }
    @Bean
    public UserUseCase getUserUseCase (UserService service) {
        return new UserUseCase(service);
    }
}
