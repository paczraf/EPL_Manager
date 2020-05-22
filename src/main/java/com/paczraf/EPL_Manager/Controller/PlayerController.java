package com.paczraf.EPL_Manager.Controller;

import com.paczraf.EPL_Manager.Model.Player;
import com.paczraf.EPL_Manager.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/add")
    private ResponseEntity<Player> add(@RequestBody Player player){
        Player addedPlayer = playerService.add(player);
        return ResponseEntity.ok().body(addedPlayer);
    }

    @GetMapping("/all")
    private ResponseEntity<List<Player>> getAll() {
        List<Player> all = playerService.getAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/club/{id}")
    private ResponseEntity<List<Player>> getAllByClubId(@PathVariable Integer id){
        List<Player> allByClub = playerService.getAllByClub(id);
        return ResponseEntity.ok().body(allByClub);
    }


}