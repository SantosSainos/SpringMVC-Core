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
	
	public void save(Admin admin) {
		
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));
		adminDao.save(admin);
	}
	
	public List<Admin> findAll(){
		return adminDao.findAll();
	}

	public Admin findById(int id) {		
		return adminDao.findById(id);
	}

	public void saveOrUpdate(Admin admin) {
		if (admin.getIdAd() == 0) {
			admin.setFechaCreacion(new Timestamp(new Date().getTime()));
			adminDao.save(admin);
		} else {
			adminDao.update(admin);	
		}
	}

	public void delete(int idAd) {
		adminDao.delete(idAd);
	}
}
