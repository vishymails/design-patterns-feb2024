package com.bvr.behavioral.state.states;

import com.bvr.behavioral.state.Player;
public abstract class  State {

    private Player player;

    public State(Player player){
        this.player = player;
    }

    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();

    public abstract void clickPrevious();
}
