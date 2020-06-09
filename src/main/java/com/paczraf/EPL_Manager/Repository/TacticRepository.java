package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Tactic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacticRepository extends JpaRepository<Tactic, Integer> {

}
