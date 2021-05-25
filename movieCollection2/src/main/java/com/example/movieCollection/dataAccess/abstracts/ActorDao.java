package com.example.movieCollection.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movieCollection.entities.concretes.Actor;

@Repository
public interface ActorDao extends JpaRepository<Actor, Integer>{

}
