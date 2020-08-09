package com.test.assignment.repositories;


import com.test.assignment.models.Player;
import com.test.assignment.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository  extends JpaRepository<Team,Long> {
}