package com.example.controller;

import com.example.entity.Donor;
import com.example.repository.DonorRepository;
import com.example.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/donor")
public class DonorController {

    @Autowired
    private DonorService donorService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    private Donor create (@RequestBody Donor donor){
        return donorService.addDonor(donor);
    }
    @GetMapping("")
    private List<Donor> view (){
        return donorService.findAllDonors() ;
    }
    @PutMapping("")
    private Donor update(@RequestBody Donor donor){
        return donorService.updateDonor(donor);
    }
    @DeleteMapping("/{id}")
    private void delete (@PathVariable Integer id){
        donorService.deleteById(id);
    }
}
