package org.example.spring.repo;

import org.example.spring.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo  extends JpaRepository<Player,Long> {
}
