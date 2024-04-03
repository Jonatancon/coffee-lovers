package com.coffee.lovers.usuarios.domain.model;
public class Account {
    private String numberAccount;
    private TypeAccount typeAccount;
    private FinancialInstitution financialInstitution;
    private User  user;

    public Account() {}

    public Account(String numberAccount, TypeAccount typeAccount, FinancialInstitution financialInstitution, User user) {
        this.numberAccount = numberAccount;
        this.typeAccount = typeAccount;
        this.financialInstitution = financialInstitution;
        this.user = user;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public FinancialInstitution getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(FinancialInstitution financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount='" + numberAccount + '\'' +
                ", typeAccount=" + typeAccount +
                ", financialInstitution=" + financialInstitution +
                ", user=" + user +
                '}';
    }
}
