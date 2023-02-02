package id.allianz.interview.ewalletsample.service;

import id.allianz.interview.ewalletsample.dto.GetBalanceRequestDTO;
import id.allianz.interview.ewalletsample.dto.PaymentRequestDTO;
import id.allianz.interview.ewalletsample.dto.PaymentResponseDTO;
import id.allianz.interview.ewalletsample.dto.TopupRequestDTO;

public interface EWalletService {

    public void doTopup(TopupRequestDTO topupRequest);

    Object getBalance(GetBalanceRequestDTO request);

    public PaymentResponseDTO doPayment(PaymentRequestDTO paymentRequest);
}
