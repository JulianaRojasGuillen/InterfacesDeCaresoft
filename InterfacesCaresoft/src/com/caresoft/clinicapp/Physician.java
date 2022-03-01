package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {
       
    public Physician(Integer id, int pin) {
		super(id,pin);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<String> patientNotes;
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }


	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
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
