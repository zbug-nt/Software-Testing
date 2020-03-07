package com.tjuscs.st;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolveTest {
	@Test
	public void testSolve1() {
		assertEquals(true, new Solve().solve(93));
	}
	
	@Test
	public void testSolve2() {
		assertEquals(true, new Solve().solve(0));
	}
	
	@Test
	public void testSolve3() {
		assertEquals(false, new Solve().solve(54));
	}
	
	@Test
	public void testSolve4() {
		assertEquals(false, new Solve().solve(-1));
	}
	
	@Test
	public void testSolve5() {
		assertEquals(false, new Solve().solve(100));
	}
}