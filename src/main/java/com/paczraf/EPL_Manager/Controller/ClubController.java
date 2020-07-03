package com.paczraf.EPL_Manager.Controller;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Repository.ClubRepository;
import com.paczraf.EPL_Manager.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/clubs")
public class ClubController {

    @Autowired
    ClubService clubService;

    @GetMapping("/all")
    private ResponseEntity<List<Club>> getAll(){
        List<Club> all = clubService.getAll();
        return ResponseEntity.ok().body(all);
    }
}
