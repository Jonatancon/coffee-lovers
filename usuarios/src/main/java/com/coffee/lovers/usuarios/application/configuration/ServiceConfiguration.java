package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.usuarios.domain.repository.*;
import com.coffee.lovers.usuarios.domain.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public AccountService getAccountService(AccountRepository repository) {
        return new AccountService(repository);
    }
    @Bean
    public AddressService getAddressService(AddressRepository repository) {
        return new AddressService(repository);
    }
    @Bean
    public FinancialInstitutionService getFinancialInstitutionService(FinancialInstitutionRepository repository) {
        return new FinancialInstitutionService(repository);
    }
    @Bean
    public ImageService getImageService(ImageRepository repository) {
        return new ImageService(repository);
    }
    @Bean
    public ModuleService getModuleService(ModuleRepository repository) {
        return new ModuleService(repository);
    }
    @Bean
    public OperationService getOperationService(OperationRepository repository) {
        return new OperationService(repository);
    }
    @Bean
    public RolOperationService getRolOperationService(RolOperationRepository repository) {
        return new RolOperationService(repository);
    }
    @Bean
    public RolService getRolService(RolRepository repository) {
        return new RolService(repository);
    }
    @Bean
    public TypeAccountService getTypeAccountService(TypeAccountRepository repository) {
        return new TypeAccountService(repository);
    }
    @Bean
    public UserService getUserService(UserRepository repository) {
        return new UserService(repository);
    }
}
