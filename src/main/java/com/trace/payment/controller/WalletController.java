package com.trace.payment.controller;

import com.trace.payment.model.Wallet;
import com.trace.payment.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Wallet create(@RequestBody Wallet wallet){
        return walletRepository.save(wallet);
    }
}
