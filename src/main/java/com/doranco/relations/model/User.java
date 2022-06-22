package com.doranco.relations.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

@Entity
public class User implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(unique = true, nullable = false)
@Email
private String email;
@Column(nullable = false)
private String mdp;

@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String telephone;

@Column(nullable = false)
private String adresse;
@Column(nullable = false)
private String grade;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
private List<Commande> commandeList;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public List<Commande> getCommandeList() {
	return commandeList;
}
public void setCommandeList(List<Commande> commandeList) {
	this.commandeList = commandeList;
}



	
	
	
	
	
	
}
