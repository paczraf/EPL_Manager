package com.paczraf.EPL_Manager.Repository;

import com.paczraf.EPL_Manager.Model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {
}