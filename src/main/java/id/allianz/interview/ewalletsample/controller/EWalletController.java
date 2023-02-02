package id.allianz.interview.ewalletsample.controller;

import id.allianz.interview.ewalletsample.dto.*;
import id.allianz.interview.ewalletsample.entity.Account;
import id.allianz.interview.ewalletsample.repository.AccountRepository;
import id.allianz.interview.ewalletsample.service.EWalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EWalletController {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private EWalletServiceImpl eWalletService;

    @PostMapping(path = "/topup")
    public ResponseEntity doTopup(@RequestBody TopupRequestDTO topupRequest){
        Optional<Account> accountData = accountRepository.findById(topupRequest.getAccountId());
        if(accountData.isPresent()){
            Account account = accountData.get();
            account.setCurrentBalance(account.getCurrentBalance() + topupRequest.getTopupAmount());
            accountRepository.save(account);
            return new ResponseEntity(new TopupResponseDTO("000",String.valueOf(account.getCurrentBalance())), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/balance/{accountId}")
    public ResponseEntity getBalance(String accountId){
        Double balance = (Double) eWalletService.getBalance(new GetBalanceRequestDTO(Long.parseLong(accountId)));
        return new ResponseEntity(new GetBalanceResponseDTO(accountId, balance), HttpStatus.OK);
    }

    @PostMapping(path = "/payment")
    public ResponseEntity doPayment(@RequestBody PaymentRequestDTO paymentRequestDTO){
        PaymentResponseDTO result = eWalletService.doPayment(paymentRequestDTO);
        return new ResponseEntity(result,HttpStatus.OK);
    }
}
