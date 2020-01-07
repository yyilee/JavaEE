package com.example.demoSQL.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * class entity
 * @author 
 * @since 
 */
@Entity
@Table(name = "service_offre")
public class OfferDo {
	@Id
    private Long offerId;
	@Column(length = 32)
	private Long userId;
    @Column(length = 32)
    private String typeService;
    @Column(length = 32)
    private String nomService;
    @Column(length = 64)
    private String natureService;
    @Column(length = 64)
    private Date dateValide;
    @Column(length = 64)
    private String description;
    @Column(length = 64)
    private String descriptionDetail;
    @Column(length = 64)
    private String localisationService;
    @Column(length = 64)
    private String etatService;
    
    public Long getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Long id) {
        this.offerId = id;
    }
    
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getTypeService() {
        return this.typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    
    public String getNomService() {
        return this.nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
    
    public String getNatureService() {
    	return this.natureService;
    }
    
    public void setNatureService(String natureService) {
    	this.natureService = natureService;
    }
       
    public Date getDateValide() {
    	return this.dateValide;
    }
    public void setDateValide(Date date) {
    	this.dateValide = date;
    }
    
    public String getDescription() {
    	return this.description;
    }
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public String getDescriptionDetail() {
    	return this.descriptionDetail;
    }
    public void setDescriptionDetail(String description) {
    	this.descriptionDetail = description;
    }
    
    public String getLocalisationService() {
    	return this.localisationService;
    }
    public void setLocalisationService(String localisationService) {
    	this.localisationService =  localisationService;
    }
    
    public String getEtatService() {
    	return this.etatService;
    }
    public void setEtatService(String etaService) {
    	this.etatService = etaService;
    }   
}