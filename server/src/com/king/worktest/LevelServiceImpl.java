package com.king.worktest;

public class LevelServiceImpl implements LevelService {
	private final RequiredScoreService requiredScoreService;

	public LevelServiceImpl(RequiredScoreService requiredScoreService) {
		this.requiredScoreService = requiredScoreService;
	}

	@Override
	public boolean completesLevel(String name, int score) {
		return score >= requiredScoreService.getScoreForLevel(name);
	}
}
