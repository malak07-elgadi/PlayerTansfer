package com.transfer.playertransfer.repository;

import com.transfer.playertransfer.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Exemple : List<Player> findByAgeGreaterThan(int age);
}
