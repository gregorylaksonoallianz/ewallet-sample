package id.allianz.interview.ewalletsample.dto;

public class GetBalanceResponseDTO {
    private String accountId;
    private Double currBalance;

    public GetBalanceResponseDTO() {
    }

    public GetBalanceResponseDTO(String accountId, Double currBalance) {
        this.accountId = accountId;
        this.currBalance = currBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
