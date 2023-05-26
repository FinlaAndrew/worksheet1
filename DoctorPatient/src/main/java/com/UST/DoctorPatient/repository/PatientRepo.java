package com.UST.DoctorPatient.repository;

import com.UST.DoctorPatient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Integer, Patient> {
}
