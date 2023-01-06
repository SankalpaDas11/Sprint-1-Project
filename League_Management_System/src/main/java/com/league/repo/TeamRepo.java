package com.league.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.league.model.Team;

public interface TeamRepo extends JpaRepository<Team,Integer>{

}
