package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.Repositories.PirateRespository;
import com.codeclan.example.pirateservice.models.Pirate;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

class PirateserviceApplicationTests {
	@Autowired // NEW
	PirateRespository pirateRepository; // NEW
	@Test
	void contextLoads() {
	}
	@Test // NEW
	public void createPirate(){ // NEW
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(jack);
	}
}
