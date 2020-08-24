package com.dxctraining.inventorymgt.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class SessionMaintain {

    private int id=-1;

    private boolean loggedIn;

    public SessionMaintain(int id){
        this.id=id;
    }

    public SessionMaintain(){
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public void saveLogin(int id){
        this.loggedIn=true;
        this.id=id;
    }
    public void  clear(){
        id=-1;
        loggedIn=false;
    }

    public boolean isLoggedIn(){
        return loggedIn;
    }
}
