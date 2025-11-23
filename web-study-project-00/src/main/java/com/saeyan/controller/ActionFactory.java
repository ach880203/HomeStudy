package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.MemberLoginAction;

public class ActionFactory {

	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAcition(String command) {
		
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("memberLogin")) {
			action = new MemberLoginAction();
	
		}
		
		return action;
		
	}
	
}
