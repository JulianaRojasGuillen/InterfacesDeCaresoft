package com.caresoft.clinicapp;

public class Usuario {
	
	protected Integer id;
    protected int pin;
    protected String rol;
    
    public Usuario(Integer id, String rol) {
    	this.id = id;
    	this.rol = rol;
    }
 
    
    public Usuario(Integer id, int pin) {
        this.id = id;
        this.pin = pin;
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
    
}
