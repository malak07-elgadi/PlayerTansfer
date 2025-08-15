package com.transfer.playertransfer.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransferOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double proposedAmount;

    @Enumerated(EnumType.STRING)
    private OfferStatus status;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
}
