package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public Movie() {

    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void showActorInfo() {
        actor.display();
    }
}
