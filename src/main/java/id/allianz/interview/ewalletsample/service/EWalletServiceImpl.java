package id.allianz.interview.ewalletsample.service;

import id.allianz.interview.ewalletsample.dto.GetBalanceRequestDTO;
import id.allianz.interview.ewalletsample.dto.PaymentRequestDTO;
import id.allianz.interview.ewalletsample.dto.PaymentResponseDTO;
import id.allianz.interview.ewalletsample.dto.TopupRequestDTO;
import id.allianz.interview.ewalletsample.entity.Account;
import id.allianz.interview.ewalletsample.entity.PaymentTransaction;
import id.allianz.interview.ewalletsample.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class EWalletServiceImpl implements EWalletService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void doTopup(TopupRequestDTO topupRequest) {


    }

    @Override
    public Object getBalance(GetBalanceRequestDTO request) {
        Optional<Account> accountData = accountRepository.findById(request.getAccountId());
        if(accountData.isPresent()) {
            Account account = accountData.get();
            return account.getCurrentBalance();
        }
        return null;
    }

    @Override
    public PaymentResponseDTO doPayment(PaymentRequestDTO paymentRequest) {
        Optional<Account> accountData = accountRepository.findById(Long.parseLong(paymentRequest.getAccountId()));
        if(accountData.isPresent()){
            Account account = accountData.get();
            account.addTransaction(new PaymentTransaction(paymentRequest.getAmount(),new Date(), paymentRequest.getBillPaymentType()));
            accountRepository.save(account);
            return new PaymentResponseDTO("00","Payment is success");
        }
        return null;
    }
}
