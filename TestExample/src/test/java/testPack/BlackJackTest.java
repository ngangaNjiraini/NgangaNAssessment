package testPack;

import static org.junit.Assert.*;

import org.junit.Test;

import packTest.BlackJack;

public class BlackJackTest {
	
	private BlackJack jack = new BlackJack();
	
	@Test
	public void testHighestWins() {
		assertEquals("Highest number did not win", 21, jack.play(16, 21));
	}

}
