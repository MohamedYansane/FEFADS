/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.big3_2020.fefads.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class EmployeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeId;
    @Column(name = "nom",nullable = false, length =85 )
    private String nom;
    @Column(name = "prenom",nullable = false, length =85 )
    private String prenom;
    @Column(name = "image",nullable = false, length =100 )
    private String image;
    @Column(name = "tel",nullable = false, length =25 )
    private String tel;
    @Column(name = "role",nullable = false, length =25 )
    private String role;
    @Column(name = "statut",nullable = false, length =10 )
    private String statut;

    public int getEmployeId() {
        return EmployeId;
    }

    public void setEmployeId(int EmployeId) {
        this.EmployeId = EmployeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "EmployeModel{" + "EmployeId=" + EmployeId + ", nom=" + nom + ", prenom=" + prenom + ", image=" + image + ", tel=" + tel + ", role=" + role + ", statut=" + statut + '}';
    }
    
    
   
    
}
