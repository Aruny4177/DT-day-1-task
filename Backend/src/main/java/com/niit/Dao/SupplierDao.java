package com.niit.Dao;

import com.niit.model.Supplier;

public interface SupplierDao {

	public void insertsupplier(Supplier supplier);
	public void supDelete(int ID);
	public Supplier getSupByid(int supId);
}
