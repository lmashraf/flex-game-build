package com.king.worktest;

import org.apache.jasper.servlet.JspServlet;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class WebServer {
	private final Logger log = LoggerFactory.getLogger(getClass());
	private final Server server;

	public WebServer(int port) throws Exception {
		server = new Server(port);

		createWebAppContext(server);


	}

	public void startAndJoin() throws Exception {
		server.start();
		server.join();

	}

	private void createWebAppContext(Server server) {
		WebAppContext webContext = new WebAppContext();

		// create a JSP temp dir
		File jspTempDir = new File(System.getProperty("jetty.home"), "work");
		if (!jspTempDir.exists()) {
			log.info("Creating JSP temp directory at" + jspTempDir);
			jspTempDir.mkdirs();
		}

		webContext.setTempDirectory(jspTempDir);
		webContext.setInitParameter("org.eclipse.jetty.servlet.Default.dirAllowed", "false");

		// Disable alias checking, such as case insensitivity, short names,
		// symbolic links and extra characters (Eg %00).
		webContext.setInitParameter("org.eclipse.jetty.servlet.Default.aliases", "true");
		webContext.setInitParameter("org.eclipse.jetty.servlet.JspServlet.keepgenerated", "true");

		webContext.setResourceBase("web");
		webContext.setContextPath("/");
		webContext.setParentLoaderPriority(true);

		// register a replacement for the JspServlet with better configuration
		ServletHolder servletHolder = new ServletHolder(JspServlet.class);
		servletHolder.setName("jsp");
		servletHolder.setInitParameter("keepgenerated", "true");
		servletHolder.setInitParameter("reloading", "true");
		servletHolder.setInitParameter("checkInterval", "0");
		servletHolder.setInitParameter("development", Boolean.toString(true));
		// servletHolder.setInitParameter("trimSpaces", "true");
		webContext.addServlet(servletHolder, "*.jsp");

		MimeTypes mimeTypes = new MimeTypes();
		mimeTypes.addMimeMapping("properties", "text/plain");
		webContext.setMimeTypes(mimeTypes);

		HandlerCollection handlerCollection = new HandlerCollection();
		handlerCollection.addHandler(webContext);
		server.setHandler(handlerCollection);
	}
}
