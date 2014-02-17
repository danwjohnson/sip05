// Source project: sip05, branch: 04 (Maven Project)
package com.springinpractice.ch05.mvc;

import org.springframework.webflow.execution.Action;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.service.PlayerService;

public class FindExistingPlayerAction implements Action{

	private PlayerService playerService;
	
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	} // end setPlayerService
	
	
	public Event execute(RequestContext context) {
		
		Event event = null;
		PlayerSearchCriteria criteria =
				(PlayerSearchCriteria)context.getFlowScope().get("playerSearchCriteria");
		
		if(criteria != null) {
			
			Player player = playerService.findExistingPlayer(criteria);
			context.getFlowScope().put("player", player);
			
			event = new Event(this, "success");
			
		}
		else {
			
			event = new Event(this, "error");
			
		} // end if/else
		
		return event;
		
	} // end execute()
	
} // end FindExistingPlayerAction
