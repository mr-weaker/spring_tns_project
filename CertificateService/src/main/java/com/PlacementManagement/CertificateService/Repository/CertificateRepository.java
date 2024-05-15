package com.PlacementManagement.CertificateService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlacementManagement.CertificateService.Entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long>{

}
