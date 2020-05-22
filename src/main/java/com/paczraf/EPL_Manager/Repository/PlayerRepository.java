package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> getAllByClub_Id(Integer club_id);
}
