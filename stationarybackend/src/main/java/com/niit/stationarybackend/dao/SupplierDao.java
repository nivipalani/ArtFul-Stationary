package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.Supplier;

public interface SupplierDao {

	boolean createSupplier(Supplier supplier);
	boolean updateSupplier(Supplier supplier);
	boolean deleteSupplier(Supplier supplier);
	List<Supplier> selectAllSupplier();
	Supplier selectOneSupplier(String s_emailId);
}
