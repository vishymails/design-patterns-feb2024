package com.bvr.behavioral.state;

import com.bvr.behavioral.state.states.ReadyState;
import com.bvr.behavioral.state.states.State;


public class Player {

    public boolean playing;
    public State state;
    public boolean doubleClick;

    public Player(){
        playing = false;
        state = new ReadyState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public void clickLock(){
        state.clickLock();
        playing = false;
    }

    public void clickPlay(){
        state.clickPlay();
        playing = true;
    }

    public void clickNext(boolean doubleClick){
        this.doubleClick = doubleClick;
        state.clickNext();
    }

    public void clickPrevious(boolean doubleClick){
        this.doubleClick = doubleClick;
        state.clickPrevious();
    }

    public void startPlaying(){
        playing = true;
        System.out.println("Start playing the song");

    }

    public void stopPlaying(){
        playing = false;
        System.out.println("Stop playing the song");
    }

    public void nextSong(){
        doubleClick = false;
        System.out.println("Next song");
    }

    public void previousSong(){
        doubleClick = false;
        System.out.println("Previous song");
    }

    public void fastForward(){
        doubleClick = true;
        System.out.println("Fast forward");
    }

    public void rewind(){
        doubleClick = true;
        System.out.println("Rewind");
    }

}
