package id.allianz.interview.ewalletsample.dto;

public class GetBalanceRequestDTO {
    private Long accountId;

    public GetBalanceRequestDTO(Long accountId) {
        this.accountId = accountId;
    }

    public GetBalanceRequestDTO() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
