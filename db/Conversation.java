package org.jivesoftware.smack.db;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "conversation")
public class Conversation {

	@DatabaseField(id = true)
	private long cId;
	
	@DatabaseField
	private long lastMessageId;
	
	
	@DatabaseField
	private boolean groupConversation;
	
	
	@DatabaseField
	private long groupOwnerId;
	
	
	@DatabaseField
	private String participants;


	public long getcId() {
		return cId;
	}


	public void setcId(long cId) {
		this.cId = cId;
	}


	public long getLastMessageId() {
		return lastMessageId;
	}


	public void setLastMessageId(long lastMessageId) {
		this.lastMessageId = lastMessageId;
	}


	public boolean isGroupConversation() {
		return groupConversation;
	}


	public void setGroupConversation(boolean groupConversation) {
		this.groupConversation = groupConversation;
	}


	public long getGroupOwnerId() {
		return groupOwnerId;
	}


	public void setGroupOwnerId(long groupOwnerId) {
		this.groupOwnerId = groupOwnerId;
	}


	public List<Integer> getParticipants() {
		String [] identityString = participants.split(",");
		List<Integer> identitys = new ArrayList<Integer>();
		for(String str :identityString){
			identitys.add(Integer.parseInt(str));
		}
		return identitys;
	}

	//TODO: find how to use message format to insert values as comma separated values or do 
	// it manually
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	
	
	
}
