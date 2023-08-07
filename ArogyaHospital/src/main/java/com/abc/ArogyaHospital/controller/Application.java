package com.abc.ArogyaHospital.controller;
import java.util.List;

import com.abc.ArogyaHospital.dao.*;
import com.abc.ArogyaHospital.model.Patients;

public class Application
{
    public static void main( String[] args )
    {
       PatientsDAO dao= new DAOImpl();
      // Patients p=new Patients();
//      p.setPid(1);
//       p.setPname("pavan");
//      p.setEmail("p@mail.com");
//      p.setCity("hyd");
//      dao.addPatient(p);
       //dao.getPatientById(1);
      //dao.deletePatientById(1);
//     List<Patients> ps=dao.viewAll();
//     for(Patients p1:ps) {
//      	  System.out.println(p1);
//        }
//       List<Patients> ps= dao.where();
//       for(Patients p1:ps) {
//  	  System.out.println(p1);

   // }
       if(dao.UpdatePatient()) {
    	   System.out.println("success");
       }
    }
}

