package com.king.worktest;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class RequiredScoreServiceImpl implements RequiredScoreService {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final Map<String, Integer> requiredScores = new HashMap<String, Integer>();

	public RequiredScoreServiceImpl() {
		final InputStream inputStream = getClass().getResourceAsStream("/levels/requiredScores.json");
		Reader reader = new InputStreamReader(inputStream);
		JsonParser parser = new JsonParser();

		JsonArray array = parser.parse(reader).getAsJsonArray();

		for (int i = 0; i < array.size(); i++) {
			JsonObject asJsonObject = array.get(i).getAsJsonObject();
			String name = asJsonObject.getAsJsonPrimitive("name").getAsString();
			int score = asJsonObject.getAsJsonPrimitive("score").getAsInt();
			requiredScores.put(name, score);
			logger.trace("Indexed required score {} for level {}", new Object[]{score, name});
		}
	}

	@Override
	public int getScoreForLevel(String name) {
		return requiredScores.get(name);
	}


}
