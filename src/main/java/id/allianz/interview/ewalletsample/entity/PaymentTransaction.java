package id.allianz.interview.ewalletsample.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PaymentTransaction {
    @Id
    private Long id;

    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "TRANSACTION_AMOUNT")
    private Double transactionAmount;
    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @Column(name = "BILL_PAYMENT_TYPE")
    private String billPaymentType;

    public PaymentTransaction() {
    }

    public PaymentTransaction(Double transactionAmount, Date transactionDate, String billPaymentType) {
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.billPaymentType = billPaymentType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getBillPaymentType() {
        return billPaymentType;
    }

    public void setBillPaymentType(String billPaymentType) {
        this.billPaymentType = billPaymentType;
    }
}
