package id.allianz.interview.ewalletsample.dto;

public class PaymentResponseDTO {
    private String responseCode;
    private String message;

    public PaymentResponseDTO(String responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    public PaymentResponseDTO() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
