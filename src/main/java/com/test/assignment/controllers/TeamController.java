package com.test.assignment.controllers;


import com.test.assignment.models.Team;
import com.test.assignment.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("team/v1/")
@Transactional
 class TeamContoller {

    @Autowired
    TeamRepository teamRepsitory;

    @GetMapping("/{id}")
    public Team addPlayer(@PathVariable Long id){
        Optional<Team> player= teamRepsitory.findById(id);
        return player.get();
    }

    @PostMapping
    public void addTeam(@RequestBody Team team){
        teamRepsitory.save(team);
    }

    @PutMapping
    public void updateTeam(@RequestBody Team team){
        teamRepsitory.save(team);
    }
}

