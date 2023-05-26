package com.UST.DoctorPatient.repository;

import com.UST.DoctorPatient.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Integer, Doctor> {
}
