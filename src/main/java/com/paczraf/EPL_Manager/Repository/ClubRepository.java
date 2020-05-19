package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {
}
