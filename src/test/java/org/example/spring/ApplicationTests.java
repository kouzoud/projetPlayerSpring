package org.example.spring;

import org.example.spring.model.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.example.spring.repo.PlayerRepo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ApplicationTests {

    @Autowired
    private PlayerRepo playerRepo;
    @Test
   public void testSvePlayer() {
        Player player = new Player();
        player.setId(12L);
        player.setName("simo");
        player.setScore(13L);

        playerRepo.save(player);
        Player player2 = playerRepo.findById(12L).get();

        assertNotNull(player2);
    }

}
