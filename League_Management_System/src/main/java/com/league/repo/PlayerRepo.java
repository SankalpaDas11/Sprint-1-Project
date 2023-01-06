package com.league.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.league.model.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer>{

}
