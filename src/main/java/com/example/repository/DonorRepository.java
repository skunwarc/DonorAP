package com.example.repository;

import com.example.entity.Donor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends CrudRepository <Donor, Integer> {
}
