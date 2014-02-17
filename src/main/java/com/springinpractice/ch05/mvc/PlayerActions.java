// Source project: sip05, branch: 04 (Maven Project)
package com.springinpractice.ch05.mvc;

import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import com.springinpractice.ch05.domain.Player;
import com.springinpractice.ch05.domain.search.PlayerSearchCriteria;
import com.springinpractice.ch05.service.PlayerService;

public class PlayerActions extends MultiAction{

	private PlayerService playerService;
	
	public void setPlayerService(PlayerService playerService) {
		
		this.playerService = playerService;
		
	} // end setPlayerService()
	
	public Event findExistingPlayer(RequestContext context) {
		
		PlayerSearchCriteria criteria =
				(PlayerSearchCriteria)context.getFlowScope().get("playerSearchCriteria");
		
		if(criteria != null) {
			
			Player player = playerService.findExistingPlayer(criteria);
			context.getFlowScope().put("player", player);
			
			return success();
			
		}
		else {
			
			return error();
			
		} // end if/else
		
	} // end findExistingPlayer()
	
	@SuppressWarnings("unused")
	public Event doSomethingElse(RequestContext context) {
		
		Event event = null;
		
		return null;
		
	} // end doSomethingElse()
	
} // end PlayerActions
