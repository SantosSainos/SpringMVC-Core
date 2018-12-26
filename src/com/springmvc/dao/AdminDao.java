package com.springmvc.dao;

import java.util.List;

import com.springmvc.pojo.Admin;

/**
 * 
 * @author Santos Sainos Hdz
 *
 * @version 1.0
 */
public interface AdminDao {
	
	public void save(Admin admin);
	
	public List<Admin> findAll();
	
	public Admin findById(int id);
	
	public List<Admin> findByNombre(String nombre);
	
	public void update(Admin admin);
	
	public void delete(int idAd);
	
	public int[] saveAll(List<Admin> admins);
}
