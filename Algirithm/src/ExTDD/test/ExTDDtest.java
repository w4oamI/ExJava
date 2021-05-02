package ExTDD.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ExTDD.ExTDD;

class ExTDDtest {

	@Test
	void testExample() {
		ExTDD et = new ExTDD();
		assertEquals(1,et.example("a"));

	}
}
