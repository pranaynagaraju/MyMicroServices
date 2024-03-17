package dev.pranay.ms3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface M3repo extends JpaRepository<Ms3Entity,Integer> {
}
