package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class DepartamentDaoJDBC implements DepartmentDao {

	Connection conn = null;

	public DepartamentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findById(Integer id) {

		PreparedStatement stm = null;
		ResultSet resultSet = null;

		try {
			stm = conn.prepareStatement("");
			stm.setInt(1, id);
			resultSet = stm.executeQuery();

			if (resultSet.next()) {
				Department dep = new Department();
				dep.setId(resultSet.getInt("DepartmentId"));
				dep.setName("depName");

				return dep;
			}

			return null;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
