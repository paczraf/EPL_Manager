package com.paczraf.EPL_Manager.Service;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Model.Player;
import com.paczraf.EPL_Manager.Repository.ClubRepository;
import com.paczraf.EPL_Manager.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player add (Player player){
        return playerRepository.save(player);
    }

    public List<Player> getAll (){
        return playerRepository.findAll();
    }

    public List<Player> getAllByClub(Integer club_id){
        return playerRepository.getAllByClub_Id(club_id);
    }

}
