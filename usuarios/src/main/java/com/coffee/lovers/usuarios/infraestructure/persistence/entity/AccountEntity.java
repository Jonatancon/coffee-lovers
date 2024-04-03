package com.coffee.lovers.usuarios.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "account")
@Getter
@Setter
public class AccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numberAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_account", referencedColumnName = "id")
    private TypeAccountEntity typeAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_financial_institution", referencedColumnName = "id")
    private FinancialInstitutionEntity financialInstitution;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private UserEntity user;
}
