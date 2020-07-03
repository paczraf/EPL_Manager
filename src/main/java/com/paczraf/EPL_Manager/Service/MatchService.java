package com.paczraf.EPL_Manager.Service;

import com.paczraf.EPL_Manager.Model.Club;
import com.paczraf.EPL_Manager.Model.Match;
import com.paczraf.EPL_Manager.Model.Tactic;
import com.paczraf.EPL_Manager.Repository.MatchRepository;
import com.paczraf.EPL_Manager.Repository.PlayerRepository;
import com.paczraf.EPL_Manager.Repository.TacticRepository;
import lombok.Data;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    TacticRepository tacticRepository;
    @Autowired
    MatchRepository matchRepository;

    public Match addNew(Match match) {
        return matchRepository.save(match);
    }

    public int getHomeClubSkills(Club homeClubId, Tactic homeClubTacticId) {
        return playerRepository.countGkSkillsByClub(homeClubId.getId()) +
                playerRepository.countDfSkillsByClub(homeClubId.getId(), homeClubTacticId.getNoOfDf()) +
                playerRepository.countMfSkillsByClub(homeClubId.getId(), homeClubTacticId.getNoOfMf()) +
                playerRepository.countFwSkillsByClub(homeClubId.getId(), homeClubTacticId.getNoOfFw());
    }

    public int getAwayClubSkills(Club awayClubId, Tactic awayClubTacticId) {
        return playerRepository.countGkSkillsByClub(awayClubId.getId()) +
                playerRepository.countDfSkillsByClub(awayClubId.getId(), awayClubTacticId.getNoOfDf()) +
                playerRepository.countMfSkillsByClub(awayClubId.getId(), awayClubTacticId.getNoOfMf()) +
                playerRepository.countFwSkillsByClub(awayClubId.getId(), awayClubTacticId.getNoOfFw());
    }

    public int getResult(int homeClubSkills, int awayClubSkills) {
        int winner;
        if (homeClubSkills > awayClubSkills) {
            winner = 1;
        } else if (homeClubSkills < awayClubSkills) {
            winner = 2;
        } else winner = 0;
        return winner;
    }

    public List<Integer> getGoals(int winner) {
        List<Integer> goals = new ArrayList<>();
        int homeClubGoals;
        int awayClubGoals;

        if (winner == 1) {
            homeClubGoals = (int) (Math.floor(Math.random() * (5 - 1 + 1) + 1));
            awayClubGoals = homeClubGoals - (int) (Math.random() * (homeClubGoals - 1 + 1) + 1);
        } else if (winner == 2) {
            awayClubGoals = (int) (Math.floor(Math.random() * (5 - 1 + 1) + 1));
            homeClubGoals = awayClubGoals - (int) (Math.random() * (awayClubGoals - 1 + 1) + 1);
        } else {
            homeClubGoals = (int) (Math.floor(Math.random() * (4 - 1 + 1) + 1));
            awayClubGoals = homeClubGoals;
        }

        goals.add(homeClubGoals);
        goals.add(awayClubGoals);
        return goals;
    }


}
