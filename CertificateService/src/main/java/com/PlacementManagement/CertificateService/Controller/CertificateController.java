package com.PlacementManagement.CertificateService.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PlacementManagement.CertificateService.Entity.Certificate;
import com.PlacementManagement.CertificateService.Repository.CertificateRepository;

@RestController
public class CertificateController {
	
    @Autowired
	CertificateRepository cer;
	
	@PostMapping("/certificate")
	public  Certificate addcertificate(@RequestBody Certificate c)
	{
		
		return cer.save(c);
	}
	
	@GetMapping("/certificate")
	public List<Certificate> showCertificates()
	{
		return cer.findAll();
	}
	
	@GetMapping("/certificate/{id}")
	public Certificate findCertificate(@PathVariable long id)
	{
		return cer.findById(id).get();
	}
	
	@DeleteMapping("/certificate/{id}")
	public void deleteCertificate(@PathVariable long id)
	{
		cer.deleteById(id);
	}
	
	@PutMapping("/certificate/{id}")
	public Certificate updateCertificate(@PathVariable long id, @RequestBody Certificate c)
	{
		c.setId(id);
		return cer.save(c);
	}
}
