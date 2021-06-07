package com.example.movieCollection.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "movie_id", nullable = false)
	private Movie movie;
	
	public Actor() {
		
	}
	
	public Actor(int actorId, String actorName, Movie movie) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.movie = movie;
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
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", movie=" + movie + "]";
	}

}
