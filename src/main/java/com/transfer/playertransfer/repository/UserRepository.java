package com.transfer.playertransfer.repository;

import com.transfer.playertransfer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
