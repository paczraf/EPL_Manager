package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> getAllByClub_Id(Integer club_id);

    @Query(value = "SELECT SUM(df_skills) FROM (SELECT * FROM Player  WHERE position=\"DF\" AND " +
                    "club_id=:club_id ORDER BY df_Skills DESC limit :numberOfPlayers" +
                    ") AS sumOfBest", nativeQuery = true)
    int countDfSkillsByClub(int club_id, int numberOfPlayers);

    @Query(value = "SELECT SUM(mf_skills) FROM (SELECT * FROM Player  WHERE position=\"MF\" AND " +
            "club_id=:club_id ORDER BY mf_Skills DESC limit :numberOfPlayers" +
            ") AS sumOfBest", nativeQuery = true)
    int countMfSkillsByClub(int club_id, int numberOfPlayers);

    @Query(value = "SELECT SUM(fw_skills) FROM (SELECT * FROM Player  WHERE position=\"FW\" AND " +
            "club_id=:club_id ORDER BY fw_Skills DESC limit :numberOfPlayers" +
            ") AS sumOfBest", nativeQuery = true)
    int countFwSkillsByClub(int club_id, int numberOfPlayers);

    @Query(value = "SELECT SUM(gk_skills) FROM (SELECT * FROM Player  WHERE position=\"GK\" AND " +
            "club_id=:club_id ORDER BY gk_Skills DESC limit 1" +
            ") AS sumOfBest", nativeQuery = true)
    int countGkSkillsByClub(int club_id);

}
