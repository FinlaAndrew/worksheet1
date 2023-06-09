package com.UST.DoctorPatient.repository;

import com.UST.DoctorPatient.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Integer, Appointment> {
}
