package com.gst.chat;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.Session;

public class ChatRoom {
	private Map<String, Session> roomSessions = new ConcurrentHashMap<String, Session>();

	public Map<String, Session> getRoomSessions() {
		return roomSessions;
	}
	
	public void broadcast(){}

	public void getAllUsers(){}
	
	//public void 
	
}
