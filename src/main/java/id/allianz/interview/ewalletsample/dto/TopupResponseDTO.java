package id.allianz.interview.ewalletsample.dto;

public class TopupResponseDTO {
    private String responseCode;
    private String balanceNow;

    public TopupResponseDTO() {
    }

    public TopupResponseDTO(String responseCode, String balanceNow) {
        this.responseCode = responseCode;
        this.balanceNow = balanceNow;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getBalanceNow() {
        return balanceNow;
    }

    public void setBalanceNow(String balanceNow) {
        this.balanceNow = balanceNow;
    }
}
