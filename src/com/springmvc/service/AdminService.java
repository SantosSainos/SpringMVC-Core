package com.springmvc.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.AdminDao;
import com.springmvc.pojo.Admin;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
	
	public boolean save(Admin admin) {
		
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));
		return adminDao.save(admin);
	}
	
	public List<Admin> findAll(){
		return adminDao.findAll();
	}

	public Admin findById(int id) {		
		return adminDao.findById(id);
	}

	public boolean saveOrUpdate(Admin admin) {
		if (admin.getIdAd() == 0) {
			admin.setFechaCreacion(new Timestamp(new Date().getTime()));
			return adminDao.save(admin);
		} else {
			return adminDao.update(admin);	
		}
	}

	public boolean delete(int idAd) {
		return adminDao.delete(idAd);
	}
}
