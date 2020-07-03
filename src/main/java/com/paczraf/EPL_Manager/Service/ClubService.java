package com.paczraf.EPL_Manager.Service;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Model.Player;
import com.paczraf.EPL_Manager.Repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    ClubRepository clubRepository;

    public List<Club> getAll(){
        return clubRepository.findAll();
    }

}
