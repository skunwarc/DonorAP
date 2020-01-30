package com.example.service;

import com.example.entity.Donor;
import com.example.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;


    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);

    }

    public List<Donor> findAllDonors() {
        List<Donor> donors =new ArrayList<>();
        donorRepository.findAll().forEach((donor)->donors.add(donor));
        return donors;
    }

    public Donor updateDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    public void deleteById(Integer id) {
        donorRepository.deleteById(id);
    }
}
