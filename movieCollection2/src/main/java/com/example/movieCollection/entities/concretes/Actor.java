package com.example.movieCollection.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actor_id")
	private int actorId;
	
	@Column(name = "actor_name")
	private String actorName;
	
	public Actor() {
		
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Actor(int actorId, String actorName) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
	}
	
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + "]";
	}

}
