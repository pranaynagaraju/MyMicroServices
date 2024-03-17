package dev.pranay.ms1;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface M1repo extends JpaRepository<Ms1Entity,Integer> {
}
