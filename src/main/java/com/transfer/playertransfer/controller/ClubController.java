package com.transfer.playertransfer.controller;

import com.transfer.playertransfer.models.Club;
import com.transfer.playertransfer.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    // GET /api/clubs
    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    // GET /api/clubs/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Club> getClubById(@PathVariable Long id) {
        Optional<Club> club = clubService.getClubById(id);
        return club.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /api/clubs
    @PostMapping
    public ResponseEntity<Club> createClub(@RequestBody Club club) {
        Club created = clubService.createClub(club);
        return ResponseEntity.ok(created);
    }
}
