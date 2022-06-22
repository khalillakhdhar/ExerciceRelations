package com.doranco.relations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	
	private String titre;
@Column(nullable = false)
	
	private String photo;
@Column(nullable = false)

private String description;
@Column(nullable = false)

private float prix;
@Column(nullable = false)

private int id_user;

@ManyToOne(optional = false)
@JoinColumn(name = "categorie",referencedColumnName = "titre")
private Categorie categorie;

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

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public float getPrix() {
	return prix;
}

public void setPrix(float prix) {
	this.prix = prix;
}

public int getId_user() {
	return id_user;
}

public void setId_user(int id_user) {
	this.id_user = id_user;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}


}
