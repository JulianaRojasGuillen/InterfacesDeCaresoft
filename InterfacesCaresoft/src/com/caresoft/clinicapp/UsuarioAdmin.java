package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin extends Usuario implements UsuarioCompatibleConHIPAA, AdminCompatibleConHIPAA{
	
	// Dentro de la clase:
    public UsuarioAdmin(Integer id, String rol) {
		super(id, rol );
		// TODO Auto-generated constructor stub
	}
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n", 
            new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }
    
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
    
   
}
