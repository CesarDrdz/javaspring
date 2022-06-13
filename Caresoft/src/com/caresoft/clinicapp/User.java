package com.caresoft.clinicapp;

import java.util.ArrayList;

public class User {
    protected Integer id;	
    protected int pin;

    // TO DO: Getters and setters
    
	// Constructor
    public User(Integer id) {
    	this.id = id;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}
}
