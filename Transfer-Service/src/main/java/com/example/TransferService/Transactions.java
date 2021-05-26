package com.example.TransferService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {

    @Id
    @Column(name="reference")
    private int reference;
    @Column(name="amount")
    private int amount;
    @Column(name="account_nr")
    private int account_nr;


    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAccount_nr() {
        return account_nr;
    }

    public void setAccount_nr(int account_nr) {
        this.account_nr = account_nr;
    }
}
