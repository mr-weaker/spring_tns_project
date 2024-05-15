package com.PlacementManagement.CertificateService.Entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String certificateName;
	private String issuingOrganization;
	private LocalDate issueDate;
	private long studentId;
	
	
	
	
	public Certificate() {
		super();
	} 
	
	
	
	public Certificate(String certificateName, String issuingOrganization, LocalDate issueDate, long studentId) {
		super();
		this.certificateName = certificateName;
		this.issuingOrganization = issuingOrganization;
		this.issueDate = issueDate;
		this.studentId = studentId;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuingOrganization() {
		return issuingOrganization;
	}
	public void setIssuingOrganization(String issuingOrganization) {
		this.issuingOrganization = issuingOrganization;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	
}
