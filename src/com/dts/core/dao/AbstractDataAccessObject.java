package com.dts.core.dao;

//import com.dts.core.util.LoggerManager;
import java.sql.*;

import com.dts.dae.dao.DBConnection;

//import java.util.Properties;

public class AbstractDataAccessObject {

	Connection con;

	public int getSequenceID(String tableName, String pkid) {
		int id = 0;
		try {
			con = new DBConnection().getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery((new StringBuilder("select max("))
					.append(pkid).append(") from ").append(tableName)
					.toString());
			if (rs.next()) {
				id = rs.getInt(1);
			}
			id++;
		} catch (SQLException se) {
			// LoggerManager.writeLogWarning(se);
			se.printStackTrace();
		} catch (Exception e) {
			// LoggerManager.writeLogWarning(e);
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException se) {
			// LoggerManager.writeLogWarning(se);
			se.printStackTrace();
		} catch (Exception e) {
			// LoggerManager.writeLogWarning(e);
			e.printStackTrace();
		}
		return id;
	}
}
