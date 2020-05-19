package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
