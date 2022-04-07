package com.example.demoNas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {
    public static List<Patient> createPatientList() {

        List<Patient> patientList = new ArrayList<>();

        patientList.add(new Patient("Anna", "123987"));
        patientList.add(new Patient("Sofia", "987123"));
        patientList.add(new Patient("Monika", "654456"));

        return patientList;
    }


    @GetMapping("/patients")
    public static String getNameSnils(@RequestParam("snils") String snils) {
        List<Patient> patients = createPatientList();
        Patient patient = new Patient();

        for (Patient pat : patients) {
            if (pat.getSnils().equals(snils)) {
                patient = pat;
            }
        }
        return patient.getName() == null ? "Пациент не найден" : patient.getName();
    }
}



