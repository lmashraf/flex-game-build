package com.king.worktest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Starter {
	private final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());


	public Starter() throws IOException {


	}

	public static void main(String[] args) throws Exception {
		final InputStream inputStream = Starter.class.getClassLoader().getResourceAsStream("core.properties");
		final Properties settings = new Properties();
		settings.load(inputStream);
		String serverPort = settings.getProperty("server.port");


		LevelService levelService = new LevelServiceImpl(new RequiredScoreServiceImpl());

		if (!levelService.completesLevel("Pyramid", 10000)) {
			throw new RuntimeException("Pyramid should complete with 10000 score!, not starting server!");
		}

		WebServer webServer = new WebServer(Integer.parseInt(serverPort));
		webServer.startAndJoin();

	}

}
