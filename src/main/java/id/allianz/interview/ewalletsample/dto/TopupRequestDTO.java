package id.allianz.interview.ewalletsample.dto;

public class TopupRequestDTO {
    private Long accountId;
    private Double topupAmount;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Double getTopupAmount() {
        return topupAmount;
    }

    public void setTopupAmount(Double topupAmount) {
        this.topupAmount = topupAmount;
    }
}
