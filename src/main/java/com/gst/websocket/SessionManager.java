package com.gst.websocket;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.Session;

public class SessionManager {
	private static SessionManager sessionManager;
	private static final Set<Session> sessions =
	            new CopyOnWriteArraySet<>();

	public SessionManager getInstance() {
		if (sessionManager == null) {
			sessionManager = new SessionManager();
		}
		return sessionManager;
	}

	private SessionManager() {}
	
	public void createLocalSession(Session session){
		sessions.add(session);
	}
	
	public void removeLocalSession(Session session){
		sessions.remove(session);
	}
}
