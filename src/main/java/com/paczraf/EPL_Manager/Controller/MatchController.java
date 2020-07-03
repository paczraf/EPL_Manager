package com.paczraf.EPL_Manager.Controller;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Model.Match;
import com.paczraf.EPL_Manager.Model.Tactic;
import com.paczraf.EPL_Manager.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping("/play/{homeId}_{awayId}/{homeTactic}_{awayTactic}")
    private ResponseEntity<Match> playGame(@RequestBody Match match, @PathVariable Club homeId, @PathVariable Club awayId, @PathVariable Tactic homeTactic, @PathVariable Tactic awayTactic) {
        match.setHomeClub(homeId);
        match.setAwayClub(awayId);
        match.setHomeClubTactic(homeTactic);
        match.setAwayClubTactic(awayTactic);

        int winner = matchService.getResult(matchService.getHomeClubSkills(homeId, homeTactic), matchService.getAwayClubSkills(awayId, awayTactic));
        List<Integer> goals = matchService.getGoals(winner);

        match.setResult(winner);
        match.setHomeClubGoals(goals.get(0));
        match.setAwayClubGoals(goals.get(1));
        matchService.addNew(match);
        return ResponseEntity.ok().body(match);
    }
}
