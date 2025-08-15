package com.transfer.playertransfer.service;

import com.transfer.playertransfer.models.TransferOffer;
import com.transfer.playertransfer.repository.TransferOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferService {

    @Autowired
    private TransferOfferRepository transferOfferRepository;

    public List<TransferOffer> getAllOffers() {
        return transferOfferRepository.findAll();
    }

    public Optional<TransferOffer> getOfferById(Long id) {
        return transferOfferRepository.findById(id);
    }

    public TransferOffer createOffer(TransferOffer offer) {
        return transferOfferRepository.save(offer);
    }
}
