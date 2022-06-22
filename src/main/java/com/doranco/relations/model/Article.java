package com.doranco.relations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//dois être un bean
// un bean (classe java qui hérite de object avec au moins un constructeur vide [par defaut])
// injectable (on peut l'appler via l'expression Autowired)
//scannable l'application le connais grâce à son annotation
public class Article {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String titre,date,auteur;
private boolean publication;
private String resume,type;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public boolean isPublication() {
	return publication;
}
public void setPublication(boolean publication) {
	this.publication = publication;
}
public String getResume() {
	return resume;
}
public void setResume(String resume) {
	this.resume = resume;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Article( String titre, String date, String auteur, boolean publication, String resume, String type) {
	super();
	
	this.titre = titre;
	this.date = date;
	this.auteur = auteur;
	this.publication = publication;
	this.resume = resume;
	this.type = type;
}
public Article() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Article [id=" + id + ", titre=" + titre + ", date=" + date + ", auteur=" + auteur + ", publication="
			+ publication + ", resume=" + resume + ", type=" + type + "]";
}







}
