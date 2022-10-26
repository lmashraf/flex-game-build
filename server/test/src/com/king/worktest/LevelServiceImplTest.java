package com.king.worktest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static se.mockachino.Mockachino.mock;
import static se.mockachino.Mockachino.when;

public class LevelServiceImplTest {
	private LevelServiceImpl levelService;
	private RequiredScoreService requiredScoreService;

	@Before
	public void setUp() throws Exception {
		requiredScoreService = mock(RequiredScoreService.class);
		levelService = new LevelServiceImpl(requiredScoreService);

	}

	@Test
	public void hasEnoughScoreToPassLevel() throws Exception {
		when(requiredScoreService.getScoreForLevel("level1")).thenReturn(500);
		assertTrue(levelService.completesLevel("level1", 1000));
	}

	@Test
	public void notEnoughScoreToPassLevel() throws Exception {
		when(requiredScoreService.getScoreForLevel("level1")).thenReturn(1000);
		assertFalse(levelService.completesLevel("level1", 500));
	}
}
