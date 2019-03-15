package com.niit.stationarybackend.dao;

import java.util.List;

import com.niit.stationarybackend.model.Address;
import com.niit.stationarybackend.model.User;

public interface AddressDao {

	boolean createAddress(Address address);

	boolean updateAddress(Address address);

	boolean deleteAddress(Address address);

	List<Address> selectAllAddress(int user_Id);

	Address selectOneAddress(int address_Id);
}
