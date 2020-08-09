package com.test.assignment.controllers;

import com.test.assignment.models.Player;
import com.test.assignment.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@RequestMapping("player/v1/")
@Transactional
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/{id}")
    public Player addPlayer(@PathVariable Long id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.get();
    }
}
