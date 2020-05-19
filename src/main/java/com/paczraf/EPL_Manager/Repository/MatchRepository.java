package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
}
