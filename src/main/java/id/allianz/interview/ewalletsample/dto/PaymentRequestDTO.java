package id.allianz.interview.ewalletsample.dto;

public class PaymentRequestDTO {
    private String accountId;
    private Double amount;
    private String billPaymentType;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBillPaymentType() {
        return billPaymentType;
    }

    public void setBillPaymentType(String billPaymentType) {
        this.billPaymentType = billPaymentType;
    }
}
