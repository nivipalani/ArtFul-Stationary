package com.niit.stationarybackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.stationarybackend.dao.SupplierDao;
import com.niit.stationarybackend.model.Category;
import com.niit.stationarybackend.model.Supplier;
import com.niit.stationarybackend.model.UserCred;

@Repository("supplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean createSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			UserCred usercred = new UserCred();
			usercred.setU_Emailid(supplier.getSupplier_emailid());
			usercred.setU_Password(supplier.getSupplier_password());
			usercred.setU_role("ROLE_ADMIN");
			usercred.setU_status("true");
			sessionFactory.getCurrentSession().save(supplier);
			sessionFactory.getCurrentSession().save(usercred);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			sessionFactory.getCurrentSession().delete(supplier.getSupplier_emailid(), UserCred.class);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Supplier> selectAllSupplier() {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from Supplier").list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Supplier selectOneSupplier(String s_emailId) {
		// TODO Auto-generated method stub
		try {
			return (Supplier) sessionFactory.getCurrentSession()
					.createQuery("from Supplier where supplier_emailid='" + s_emailId + "'").uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
