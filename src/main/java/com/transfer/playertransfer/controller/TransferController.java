package com.transfer.playertransfer.controller;

import com.transfer.playertransfer.models.TransferOffer;
import com.transfer.playertransfer.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    @Autowired
    private TransferService transferService;

    // GET /api/transfers
    @GetMapping
    public List<TransferOffer> getAllOffers() {
        return transferService.getAllOffers();
    }

    // GET /api/transfers/{id}
    @GetMapping("/{id}")
    public ResponseEntity<TransferOffer> getOfferById(@PathVariable Long id) {
        Optional<TransferOffer> offer = transferService.getOfferById(id);
        return offer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /api/transfers
    @PostMapping
    public ResponseEntity<TransferOffer> createOffer(@RequestBody TransferOffer offer) {
        TransferOffer created = transferService.createOffer(offer);
        return ResponseEntity.ok(created);
    }
}
