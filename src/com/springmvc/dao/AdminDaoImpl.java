package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.pojo.Admin;
import com.springmvc.pojo.AdminRowMapper;

/**
 * 
 * @author Santos Sainos Hdz
 *
 * @version 1.0
 */
@Component("adminDao")
public class AdminDaoImpl implements AdminDao{

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idAd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] saveAll(List<Admin> admins) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
