package id.allianz.interview.ewalletsample.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Account {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CURR_BALANCE")
    private Double currentBalance;

    private Set<PaymentTransaction> transactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Set<PaymentTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<PaymentTransaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(PaymentTransaction trx){
        if(transactions == null){
            transactions = new HashSet<>();
        }
        transactions.add(trx);
    }

}
