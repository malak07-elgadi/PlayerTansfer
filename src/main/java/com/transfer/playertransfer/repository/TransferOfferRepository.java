package com.transfer.playertransfer.repository;

import com.transfer.playertransfer.models.TransferOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferOfferRepository extends JpaRepository<TransferOffer, Long> {
}
