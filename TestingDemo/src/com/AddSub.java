package com;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AddSub {
	@Test
	void add() {
		Cal1 c = new Cal1();
		assertEquals(300, c.add(100, 200));	
	}
	@Test
	void sub() {
		Cal1 c = new Cal1();
		assertEquals(100, c.sub(200, 100));	
	}
}
