package com.gst.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

@ServerEndpoint(value = "/websocket/chatService")
public class SocketServer {
	private static final Log log = LogFactory.getLog(SocketServer.class);
	
	@OnOpen
	public void sessionConnected(Session session){
		
	}
	
	@OnClose
	public void sessionClosed(Session session){
		
	}
	
	@OnMessage
	public void messageReceived(String msg){
		
	}
	
	@OnError
	public void sessionException(Throwable t){
		 log.error("Chat Error: " + t.toString(), t);
	}
	
}
