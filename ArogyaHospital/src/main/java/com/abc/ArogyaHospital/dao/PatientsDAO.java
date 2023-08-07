package com.abc.ArogyaHospital.dao;

import java.util.List;

import com.abc.ArogyaHospital.model.Patients;

public interface PatientsDAO {
  public void addPatient(Patients p);
  public void getPatientById(int i);
  public boolean UpdatePatient();
  public void deletePatientById(int i);
  public List<Patients> viewAll();
  public List<Patients> where();
  
}
