package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CatID;
	private String CatName;
	private String SubCat;
	public int getCatID() {
		return CatID;
	}
	public void setCatID(int catID) {
		CatID = catID;
	}
	public String getCatName() {
		return CatName;
	}
	public void setCatName(String catName) {
		CatName = catName;
	}
	public String getSubCat() {
		return SubCat;
	}
	public void setSubCat(String subCat) {
		SubCat = subCat;
	}
	@Override
	public String toString() {
		return "Category [CatID=" + CatID + ", CatName=" + CatName + ", SubCat=" + SubCat + "]";
	}
	

}
