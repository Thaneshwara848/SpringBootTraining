package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulDiv {
	@Test
	void mul() {
		Cal1 c = new Cal1();
		assertEquals(200, c.mul(10, 20));
		
	}
	
	@Test
	void div() {
		Cal1 c = new Cal1();
		assertEquals(2, c.div(200, 100));
		
	}

}
