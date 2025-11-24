package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.FruitJoinAction;
import com.saeyan.controller.action.IdCheckAction;
import com.saeyan.controller.action.MemberLoginAction;
import com.saeyan.controller.action.MemberLoginFormAction;

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
			
		    action = new MemberLoginFormAction();
		    
		}else if(command.equals("fruitHome")) {
			
		    action = new MemberLoginAction();
		    
		}else if(command.equals("fruitJoin")) {
			
			action = new FruitJoinAction();
			
		}else if(command.equals("idCheck")) {
			
			action = new IdCheckAction();
			
		}

	System.out.println("action 객체 : " + action);
		
		return action;
		
	}
	
}
