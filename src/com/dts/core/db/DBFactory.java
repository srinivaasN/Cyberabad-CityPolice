package com.dts.core.db;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.dae.dao.DBConnection;
public class DBFactory {
	 public DBFactory()
	    {
	        new DBConnection().getConnection();
}
}